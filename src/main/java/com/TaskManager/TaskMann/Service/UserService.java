package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.Request.UserRequestCreate;
import com.TaskManager.TaskMann.DTO.Response.UserResponse;
import com.TaskManager.TaskMann.DTO.UserDTO;
import com.TaskManager.TaskMann.Mapper.Mapper;
import com.TaskManager.TaskMann.Model.User;
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
    public UserResponse createUser(UserRequestCreate userDto) {


        User user = User.builder()
                .email(userDto.getEmail())
                .username(userDto.getUsername())
                .password_hash(userDto.getPassword_hash())
                .full_name(userDto.getFull_name())
                .created_at(userDto.getCreated_at())
                .build();
        userRepository.save(user);

        UserResponse responseUser = UserResponse.builder()
                .email(userDto.getEmail())
                .username(userDto.getUsername())
                .full_name(userDto.getFull_name())
                .build();

        return responseUser;
    }

    @Override
    public UserDTO getUser(Integer user_id) {
        return null;
    }

    @Override
    public UserDTO updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Integer user_id) {

    }
}
