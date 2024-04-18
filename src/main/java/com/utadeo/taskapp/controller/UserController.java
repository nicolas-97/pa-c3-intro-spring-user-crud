package com.utadeo.taskapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.utadeo.taskapp.dto.ApiResponse;
import com.utadeo.taskapp.model.User;
import com.utadeo.taskapp.service.IUserService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("user")
public class UserController {

    private IUserService userService;

    UserController(IUserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ApiResponse store(@RequestBody User user){
        
        User userStore = this.userService.createUser(user);
        return new ApiResponse(
            HttpStatus.CREATED.value(),
            "EL usuario ha sido creado",
            userStore
        );
    }   
    
    @GetMapping("/{id}")
    public User show(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }
}
