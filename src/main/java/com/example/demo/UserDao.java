package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: Chapter4-4-1
 * @description:
 * @author: zhangshulong
 * @create: 2018-01-18 15:50
 **/
@Mapper
public interface UserDao {
    List<User> findAll(User user);
    void save(User user);
    User findByName(String name);
}
