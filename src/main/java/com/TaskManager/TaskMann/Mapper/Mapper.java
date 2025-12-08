package com.TaskManager.TaskMann.Mapper;

import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Model.User;

public class Mapper {

    public static UserDTO toDTO(User user) {
        if (user==null) return null;

        return UserDTO.builder()
                .user_id(user.getUser_id())
                .email(user.getEmail())
                .username(user.getUsername())
                .full_name(user.getFull_name())
                .build();
    }


}
