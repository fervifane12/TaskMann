package com.TaskManager.TaskMann.DTO;

import com.TaskManager.TaskMann.Model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
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
