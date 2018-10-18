package com.ocean.springbootmybatisdemo.repository.dal.test.mapper;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserDO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table user.
 * user
 */
public interface UserDOMapper{

    /**
     * desc:insert:notify_record.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO user(ID,USERNAME) VALUES (#{id,jdbcType=INTEGER},#{username,jdbcType=VARCHAR})
     * @param entity entity
     * @return int
     */
    int insert(UserDO entity);
    /**
     * desc:get:notify_record.<br/>
     * descSql =  select id,username from user
     * @return List<UserDO>
     */
    List<UserDO> findAllUser();
}
