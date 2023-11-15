package com.boot.springboot.web.controller;

import com.boot.springboot.web.model.User;
import com.boot.springboot.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getUsers(Model model) {
        List<User> users =userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @GetMapping(value = "/add")
    public String addUserForm(User user) {
        return "add";
    }
    @PostMapping(value = "/add")
    public String addUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "redirect:/";
    }
    @GetMapping(value = "/update/{id}")
    public String updateUserForm(@PathVariable("id") int id, Model model) {
        User user= userService.getUser(id);
        model.addAttribute("user", user);
        return "update";
    }

    @PostMapping("/update")
    public String updateUser(User user) {
        user.setName(user.getName());
        user.setAge(user.getAge());
        userService.updateUser(user);
        return "redirect:/";}
}
