package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Model.User;

import java.util.List;

public interface IUserService {

    List<UserDTO> GetAllUsers();
    UserDTO getUser(Integer user_id);
    UserDTO createUser(User user);
    UserDTO updateUser(Integer user_id, User user);
    void deleteUser (Integer user_id);

}
