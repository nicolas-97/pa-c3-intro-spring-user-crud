package com.utadeo.taskapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utadeo.taskapp.dto.TaskDto;
import com.utadeo.taskapp.model.Task;
import com.utadeo.taskapp.service.ITaskService;

@RestController
@RequestMapping("task")
public class TaskController {

    private ITaskService taskService;

    TaskController(ITaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    Task store(@RequestBody TaskDto taskDto){
        return this.taskService.createTask(taskDto);
    }
}
