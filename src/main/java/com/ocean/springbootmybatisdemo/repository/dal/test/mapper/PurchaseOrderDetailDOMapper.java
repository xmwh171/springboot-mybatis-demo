package com.ocean.springbootmybatisdemo.repository.dal.test.mapper;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.PurchaseOrderDetailDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table purchase_order_detail.
 * purchase_order_detail
 */
public interface PurchaseOrderDetailDOMapper{

    /**
     * desc:插入表:purchase_order_detail.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO purchase_order_detail( ID ,PROP1 ,PROP2 ,REMARK ,SPEC_NO ,REC_ID ,PURCHASE_ID ,MODIFIED ,GMT_CREATE ,GMT_MODIFY ,NUM ,TAX ,PRICE ,AMOUNT ,DISCOUNT ,TAX_PRICE ,TAX_AMOUNT ,STOCKIN_NUM ,STOCKIN_AMOUNT )VALUES( null , #{prop1,jdbcType=VARCHAR} , #{prop2,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{specNo,jdbcType=VARCHAR} , #{recId,jdbcType=INTEGER} , #{purchaseId,jdbcType=INTEGER} , #{modified,jdbcType=DATE} , now() , #{gmtModify,jdbcType=TIMESTAMP} , #{num,jdbcType=DECIMAL} , #{tax,jdbcType=DECIMAL} , #{price,jdbcType=DECIMAL} , #{amount,jdbcType=DECIMAL} , #{discount,jdbcType=DECIMAL} , #{taxPrice,jdbcType=DECIMAL} , #{taxAmount,jdbcType=DECIMAL} , #{stockinNum,jdbcType=DECIMAL} , #{stockinAmount,jdbcType=DECIMAL} )
     * @param entity entity
     * @return int
     */
    int insert(PurchaseOrderDetailDO entity);
}
