package com.TaskManager.TaskMann.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer task_id;

    private String title;

    @ManyToOne
    private Project project_id;

    private String description;
    private String status;

    @ManyToOne
    private User asigned_to;
}
