package com.ocean.springbootmybatisdemo.mapper;

import com.ocean.springbootmybatisdemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Author xiaohu
 * @Date 2018/10/17 14:35
 */
@Mapper
public interface UserMapper {


    List<User> findAllUser();

    int insert(User user);
}
