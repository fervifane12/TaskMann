package com.TaskManager.TaskMann.DTO;

import com.TaskManager.TaskMann.Model.Project;
import com.TaskManager.TaskMann.Model.Task;
import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDTO {

    private Integer user_id;
    private String email;
    private String username;
    private String full_name;
    private List<ProjectDTO> user_projects;
    private List<TaskDTO> user_tasks;

}
