package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService {

    @Override
    public List<TaskDTO> getAllTasks(Integer user_id) {
        return List.of();
    }

    @Override
    public TaskDTO getTask(Integer task_id) {
        return null;
    }

    @Override
    public TaskDTO updateTask(Integer task_id) {
        return null;
    }

    @Override
    public void deleteTask(Integer task_id) {

    }
}
