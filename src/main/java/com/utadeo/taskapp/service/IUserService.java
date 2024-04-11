package com.utadeo.taskapp.service;

import java.util.List;

import com.utadeo.taskapp.model.User;

public interface IUserService {

    User createUser(User user);
    User updateUser(Long id, User user);
    User getById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    
}
