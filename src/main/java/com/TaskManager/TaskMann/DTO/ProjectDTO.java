package com.TaskManager.TaskMann.DTO;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProjectDTO {

    private Integer project_id;
    private String project_name;
    private String project_description;
    private Integer owner_id;

}
