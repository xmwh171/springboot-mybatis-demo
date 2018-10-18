package com.ocean.springbootmybatisdemo.service;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserInfoDO;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 10:02
 */
public interface UserInfoService {

    public int create(UserInfoDO entity);
}
