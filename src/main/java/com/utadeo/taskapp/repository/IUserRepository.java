package com.utadeo.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utadeo.taskapp.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
