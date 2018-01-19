package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper

@CacheConfig(cacheNames = "user")
public interface UserDao {
    @Cacheable
    List<User> findAll(User user);
    void save(User user);
    User findByName(String name);
}
