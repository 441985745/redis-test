package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Cacheable
    public List<User> findAll(User user) {
        System.out.println("==================findAll=================");
        return userDao.findAll(user);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findByName(String name) {
        System.out.println("=================findByName=================");
        return userDao.findByName(name);
    }
}
