package com.boot.springboot.web.service;

import com.boot.springboot.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void saveUser(User user);
    void updateUser(User user);
    public User getUser(int id);
    void deleteUser(int id);
}