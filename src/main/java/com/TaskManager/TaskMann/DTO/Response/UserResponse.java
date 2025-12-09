package com.TaskManager.TaskMann.DTO.Response;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserResponse {
    private String email;
    private String username;
    private String full_name;
}
