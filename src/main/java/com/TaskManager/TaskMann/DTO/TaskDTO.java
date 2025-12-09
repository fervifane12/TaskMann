package com.TaskManager.TaskMann.DTO;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TaskDTO {
    private Integer task_id;
    private String title;
    private Integer project_id;
    private String description;
    private String status;
    private Integer assigned_to_user_id;

}