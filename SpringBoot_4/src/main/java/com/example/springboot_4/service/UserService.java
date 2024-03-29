package com.example.springboot_4.service;


import com.example.springboot_4.entity.User;

import java.util.List;

public interface UserService {
    List<User> getDefaultUsers();
    void createUser(User user);
}
