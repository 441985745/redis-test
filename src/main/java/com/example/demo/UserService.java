package com.example.demo;

import java.util.List;

/**
 * @program: Chapter4-4-1
 * @description:
 * @author: zhangshulong
 * @create: 2018-01-18 15:47
 **/
public interface UserService {
    List<User> findAll(User user);
    void save(User user);
    User findByName(String name);
}
