package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.ProjectDTO;
import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Mapper.Mapper;
import com.TaskManager.TaskMann.Model.User;
import com.TaskManager.TaskMann.Repository.ProjectRepository;
import com.TaskManager.TaskMann.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> GetAllUsers() {
        return userRepository.findAll().stream().map(Mapper::toDTO).toList();
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
