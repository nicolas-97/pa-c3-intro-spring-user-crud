package com.utadeo.taskapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.utadeo.taskapp.model.User;
import com.utadeo.taskapp.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    private IUserService userService;

    UserController(IUserService userService){
        this.userService = userService;
    }

    @PostMapping("user/")
    public User store(@RequestBody User user){
        return this.userService.createUser(user);
    }
    
    
}
