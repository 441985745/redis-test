package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll(User user);
    void save(User user);
    User findByName(String name);
}
