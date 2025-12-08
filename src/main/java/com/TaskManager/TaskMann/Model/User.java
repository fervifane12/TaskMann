package com.TaskManager.TaskMann.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String password_hash;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "last_update")
    private LocalDateTime last_update;

    @OneToMany(mappedBy = "owner")
    private List<Project> owned_projects;

    @OneToMany(mappedBy = "assigned_to")
    private List<Task> assigned_tasks;

}


