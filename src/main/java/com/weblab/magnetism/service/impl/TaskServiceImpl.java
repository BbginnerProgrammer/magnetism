package com.weblab.magnetism.service.impl;

import com.weblab.magnetism.model.Role;
import com.weblab.magnetism.repository.RoleRepository;
import com.weblab.magnetism.repository.TaskRepository;
import com.weblab.magnetism.service.interf.RoleService;
import com.weblab.magnetism.service.interf.TaskService;
import org.springframework.data.repository.CrudRepository;
import com.weblab.magnetism.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractCRUDService<Task, Long> implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    CrudRepository<Task, Long> getRepository() {
        return taskRepository;
    }

}
