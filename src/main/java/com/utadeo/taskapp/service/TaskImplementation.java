package com.utadeo.taskapp.service;

import org.springframework.stereotype.Service;

import com.utadeo.taskapp.dto.TaskDto;
import com.utadeo.taskapp.model.Task;
import com.utadeo.taskapp.model.User;
import com.utadeo.taskapp.repository.ITaskRepository;
import com.utadeo.taskapp.repository.IUserRepository;

@Service
public class TaskImplementation implements ITaskService{

    private ITaskRepository taskRepository;
    private IUserRepository userRepository;

    TaskImplementation(ITaskRepository taskRepository, IUserRepository userRepository){
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Task createTask(TaskDto taskDto){
        User user = this.userRepository.findById(taskDto.getUserId()).orElse(null);
        Task task = new Task(taskDto.getTitle(), taskDto.getDescription(), user);
        return this.taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id){
        this.taskRepository.deleteById(id);
    }
}
