package com.ocean.springbootmybatisdemo.repository.dal.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserDO;
import java.util.List;
import com.ocean.springbootmybatisdemo.repository.dal.test.mapper.UserDOMapper;

/**
* The Table user.
* user
*/
@Repository
public class UserDAO{

    @Autowired
    private UserDOMapper userDOMapper;

    /**
     * desc:insert:notify_record.<br/>
     * @param entity entity
     * @return int
     */
    public int insert(UserDO entity){
        return userDOMapper.insert(entity);
    }
    /**
     * desc:get:notify_record.<br/>
     * @return List<UserDO>
     */
    public List<UserDO> findAllUser(){
        return userDOMapper.findAllUser();
    }
}
