package com.boot.springboot.web.service;

import com.boot.springboot.web.DAO.UserDao;
import com.boot.springboot.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao daoCar) {
        this.userDao = daoCar;
    }

    @Transactional
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user){userDao.updateUser(user);}
    @Transactional
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }


}


