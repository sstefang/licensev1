package com.rockettest1.control.security.service;


import com.rockettest1.control.security.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}