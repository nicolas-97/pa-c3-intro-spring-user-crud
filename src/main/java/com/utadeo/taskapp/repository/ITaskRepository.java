package com.utadeo.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utadeo.taskapp.model.Task;

public interface ITaskRepository extends JpaRepository<Task, Long>{

    Task findByTitle(String title);
}
