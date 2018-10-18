package com.ocean.springbootmybatisdemo.repository.dal.test.mapper;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserInfoDO;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table user_info.
 * user_info
 */
public interface UserInfoDOMapper{

    /**
     * desc:插入表:user_info.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO user_info( ID ,NAME ,AGE ,GMT_CREATE ,GMT_MODIFY )VALUES( null , #{name,jdbcType=VARCHAR} , #{age,jdbcType=INTEGER} , now() , #{gmtModify,jdbcType=TIMESTAMP} )
     * @param entity entity
     * @return int
     */
    int insert(UserInfoDO entity);
}
