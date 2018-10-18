package com.ocean.springbootmybatisdemo.controller;

import com.ocean.springbootmybatisdemo.repository.dal.test.dataobject.UserInfoDO;
import com.ocean.springbootmybatisdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/18 10:06
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/create", method = {RequestMethod.GET, RequestMethod.POST})
    public void create(String age,String name){
        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setAge(Integer.parseInt(age));
        userInfoDO.setName(name);
        userInfoDO.setGmtModify(new Date());
        userInfoService.create(userInfoDO);
        return ;
    }
}
