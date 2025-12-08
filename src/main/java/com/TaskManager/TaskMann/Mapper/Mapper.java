package com.TaskManager.TaskMann.Mapper;

import com.TaskManager.TaskMann.DTO.ProjectDTO;
import com.TaskManager.TaskMann.DTO.TaskDTO;
import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Model.Project;
import com.TaskManager.TaskMann.Model.Task;
import com.TaskManager.TaskMann.Model.User;

public class Mapper {

    public static UserDTO toDTO(User user) {
        if (user==null) return null;

        return UserDTO.builder()
                .user_id(user.getUser_id())
                .email(user.getEmail())
                .username(user.getUsername())
                .full_name(user.getFull_name())
                .user_projects(user.getOwned_projects().stream().map(Mapper::toDTO).toList())
                .user_tasks(user.getAssigned_tasks().stream().map(Mapper::toDTO).toList())
                .build();
    }

    public static ProjectDTO toDTO(Project project){
        if (project == null) return null;

        return ProjectDTO.builder()
                .owner_id(project.getOwner().getUser_id())
                .project_id(project.getProject_id())
                .project_name(project.getProject_name())
                .project_description(project.getProject_description())
                .build();
    }

    public static TaskDTO toDTO(Task task){
        if (task == null) return null;

        return TaskDTO.builder()
                .task_id(task.getTask_id())
                .title(task.getTitle())
                .project_id(task.getProject_id().getProject_id())
                .description(task.getDescription())
                .status(task.getStatus())
                .assigned_to_user_id(task.getAsigned_to().getUser_id())
                .build();
    }


}
