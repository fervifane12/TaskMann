package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    public List<UserDTO> GetAllUsers() {
        return List.of();
    }

    @Override
    public UserDTO getUser(Integer user_id) {
        return null;
    }

    @Override
    public UserDTO createUser(User user) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer user_id, User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer user_id) {

    }
}
