package com.TaskManager.TaskMann.DTO.Request;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequestCreate {

    private String email;
    private String username;
    private String password_hash;
    private String full_name;
    private LocalDateTime created_at;
}
