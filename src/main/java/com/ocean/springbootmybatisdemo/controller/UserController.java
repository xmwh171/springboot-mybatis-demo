package com.ocean.springbootmybatisdemo.controller;

import com.ocean.springbootmybatisdemo.model.User;
import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserDO;
import com.ocean.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/17 14:26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/userList", method = {RequestMethod.GET, RequestMethod.POST})
    public List<User> getUserList(){
        List<User> userList = userService.findAllUser();
        return userList;
    }

    @RequestMapping(value="/create", method = {RequestMethod.GET, RequestMethod.POST})
    public void create(String username){
        User user = new User();
        user.setUsername(username);
        userService.create(user);
        return ;
    }

    @RequestMapping(value="/userList2", method = {RequestMethod.GET, RequestMethod.POST})
    public List<UserDO> getUserList2(){
        List<UserDO> userList = userService.findAllUser2();
        return userList;
    }

    @RequestMapping(value="/create2", method = {RequestMethod.GET, RequestMethod.POST})
    public void create2(String username){
        UserDO userDO = new UserDO();
        userDO.setUsername(username);
        userService.insert(userDO);
        return ;
    }

}

