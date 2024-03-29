package com.example.springboot_4.service;

import com.example.springboot_4.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final List<User> users = new ArrayList<>();
    @Override
    public List<User> getDefaultUsers() {
        List<User> users = new ArrayList<>();
        // Add default users
        users.add(new User("long", "long@123"));
        users.add(new User("long", "long@123"));
        users.add(new User("long", "long@123"));
        return users;
    }
    @Override
    public void createUser(User user) {
        users.add(user);

    }
}
