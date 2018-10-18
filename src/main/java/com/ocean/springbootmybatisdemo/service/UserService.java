package com.ocean.springbootmybatisdemo.service;

import com.ocean.springbootmybatisdemo.model.User;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserDO;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/17 14:36
 */
public interface UserService {

    /**
     * 查询用户列表
     * @return
     */
    public List<User> findAllUser();

    /**
     * 新增用户
     * @param user
     * @return
     */
    public int create(User user);

    public int insert(UserDO entity);

    public List<UserDO> findAllUser2();
}
