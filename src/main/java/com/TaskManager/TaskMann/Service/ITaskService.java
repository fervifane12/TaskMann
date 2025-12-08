package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.TaskDTO;
import com.TaskManager.TaskMann.Model.Task;

import java.util.List;

public interface ITaskService {

    List<TaskDTO> getAllTasks (Integer user_id);
    TaskDTO getTask (Integer task_id);
    TaskDTO updateTask (Integer task_id);
    void deleteTask (Integer task_id);
    
}
