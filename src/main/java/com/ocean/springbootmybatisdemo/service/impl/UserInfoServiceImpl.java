package com.ocean.springbootmybatisdemo.service.impl;

import com.ocean.springbootmybatisdemo.repository.dal.test.dao.UserInfoDAO;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserInfoDO;
import com.ocean.springbootmybatisdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 10:05
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public int create(UserInfoDO entity) {
        return userInfoDAO.insert(entity);
    }
}
