package com.boot.springboot.web.DAO;


import com.boot.springboot.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);
    void updateUser(User user);
    User getUser(int id);

    void deleteUser(int id);
}
