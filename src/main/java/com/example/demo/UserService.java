package com.example.demo;

import java.util.List;

public interface UserService {
    List<User> findAll(User user);
    void save(User user);
    User findByName(String name);
}
