package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.Request.UserRequestCreate;
import com.TaskManager.TaskMann.DTO.Response.UserResponse;
import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Model.User;

import java.util.List;

public interface IUserService {

    List<UserDTO> GetAllUsers();

    UserResponse createUser(UserRequestCreate userDto);

    UserDTO getUser(Integer user_id);
    UserDTO createUser(User user);
    UserDTO updateUser(User user);
    void deleteUser (Integer user_id);

}
