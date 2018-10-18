package com.ocean.springbootmybatisdemo.service.impl;

import com.ocean.springbootmybatisdemo.mapper.UserMapper;
import com.ocean.springbootmybatisdemo.model.User;
import com.ocean.springbootmybatisdemo.repository.dal.test.dao.UserDAO;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserDO;
import com.ocean.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/17 14:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int create(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int insert(UserDO entity) {
        return userDAO.insert(entity);
    }

    @Override
    public List<UserDO> findAllUser2() {
        return userDAO.findAllUser();
    }
}
