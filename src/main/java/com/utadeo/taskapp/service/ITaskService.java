package com.utadeo.taskapp.service;

import com.utadeo.taskapp.dto.TaskDto;
import com.utadeo.taskapp.model.Task;

public interface ITaskService {
    
    Task createTask(TaskDto task);
    void deleteTask(Long id);
}
