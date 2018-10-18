<@pp.dropOutputFile />
<#import "../lib/lib.ftl" as lib/>
<#list dalgen.tables as table>
    <@pp.changeOutputFile name = "/${dalgen.tablesPath}/${table.sqlName}.xml" />
<!DOCTYPE table SYSTEM "../config/table-config-1.0.dtd">
<table sqlname="${table.sqlName?lower_case}" physicalName="${table.physicalName?lower_case}"<#if table.remark??>
       remark="${table.remark?lower_case}"</#if>>
    <!--  特殊字符说明 &lt;&gt; <> -->
    <!-- baseSql option中 select * 会自动替换为 include -->
    <sql id="Base_Column_List">
        <#list table.columnList as column><#if column_index gt 0><#if column_index%5==0>${" \n"}        </#if>
            ,</#if>${column.sqlName}</#list>
    </sql>

    <!-- baseSql option中 select sf.* 会自动替换为 include -->
    <sql id="Base_SF_Column_List">
        <#list table.columnList as column><#if column_index gt 0><#if column_index%5==0>${"\n"}        </#if>,</#if>
            sf.${column.sqlName}</#list>
    </sql>

    <operation name="insert" paramtype="object" remark="插入表:${table.sqlName?lower_case}">
        <#if dalgen.dbType=="MySQL">
        <selectKey resultType="java.lang.Long" keyProperty="id" order="AFTER">
            SELECT
            LAST_INSERT_ID()
        </selectKey>
        </#if>
        INSERT INTO ${table.sqlName?lower_case}(
        <#list table.columnList as column>
            <#if column_index gt 0>,</#if>${column.sqlName}
        </#list>
        )VALUES(
        <#list table.columnList as column>
            <#if column_index gt 0>,</#if> ${lib.insertVal(column,dalgen)}
        </#list>
        )
    </operation>



<#list table.uniqueIndexs as uniqueIndex>

    <!-- 根据唯一约束操作数据 -->
    <operation name="updateBy${uniqueIndex.ukName}" paramtype="object"
               remark="根据唯一约束${uniqueIndex.ukName}更新表:${table.sqlName?lower_case}">
        UPDATE ${table.sqlName?lower_case}
        SET
        <#assign c_idx = 0>
        <#list table.columnList as column>
            <#if lib.updateIncludeUKColumn(dalgen,column,table.primaryKeys!,uniqueIndex.columnList)><#assign c_idx = c_idx+1>
                <#if c_idx gt 1>,</#if>${column.sqlName}${lib.space(column.sqlName)} = ${lib.updateVal(column)}
            </#if>
        </#list>
        WHERE
        <#list uniqueIndex.columnList as column>
            <#if column_index gt 0>AND </#if>${column.sqlName}${lib.space(column.sqlName)} = ${"#"}{${column.javaName}
            ,jdbcType=${column.sqlType}}
        </#list>
    </operation>

    <operation name="deleteBy${uniqueIndex.ukName}"
               remark="根据唯一约束${uniqueIndex.ukName}删除数据:${table.sqlName?lower_case}">
        DELETE FROM ${table.sqlName?lower_case}
        WHERE
        <#list uniqueIndex.columnList as column>
            <#if column_index gt 0>AND </#if>${column.sqlName}${lib.space(column.sqlName)} = ${"#"}{${column.javaName}
            ,jdbcType=${column.sqlType}}
        </#list>
    </operation>

    <operation name="getBy${uniqueIndex.ukName}" multiplicity="one"
               remark="根据唯一约束${uniqueIndex.ukName}获取数据:${table.sqlName?lower_case}">
        SELECT *
        FROM ${table.sqlName?lower_case}
        WHERE
        <#list uniqueIndex.columnList as column>
            <#if column_index gt 0>AND </#if>${column.sqlName}${lib.space(column.sqlName)} = ${"#"}{${column.javaName}
            ,jdbcType=${column.sqlType}}
        </#list>
    </operation>
</#list>

<#list table.normalIndexs as normalIndex>
    <!-- 根据普通索引查询数据 -->
    <operation name="queryBy${normalIndex.idxName}" multiplicity="many"
               remark="根据普通索引${normalIndex.idxName}获取数据:${table.sqlName?lower_case}">
        SELECT *
        FROM ${table.sqlName?lower_case}
        WHERE
        <#list normalIndex.columnList as column>
            <#if column_index gt 0>AND </#if>${column.sqlName}${lib.space(column.sqlName)} = ${"#"}{${column.javaName}
            ,jdbcType=${column.sqlType}}
        </#list>
    </operation>
</#list>
</table>
</#list>
