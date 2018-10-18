package com.ocean.springbootmybatisdemo.repository.dal.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserInfoDO;
import com.ocean.springbootmybatisdemo.repository.dal.test.mapper.UserInfoDOMapper;

/**
* The Table user_info.
* user_info
*/
@Repository
public class UserInfoDAO{

    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    /**
     * desc:插入表:user_info.<br/>
     * @param entity entity
     * @return int
     */
    public int insert(UserInfoDO entity){
        return userInfoDOMapper.insert(entity);
    }
}
