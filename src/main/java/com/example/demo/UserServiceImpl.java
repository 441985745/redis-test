package com.example.demo;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Chapter4-4-1
 * @description:
 * @author: zhangshulong
 * @create: 2018-01-18 15:47
 **/
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    @Cacheable
    public List<User> findAll(User user){
        System.out.println("==================findAll=================");
       return userDao.findAll(user);
    }
    @Override
    public void save(User user){
        userDao.save(user);
    }
    @Override
    public  User findByName(String name){
        System.out.println("=================findByName=================");
        return userDao.findByName(name);
    }
}
