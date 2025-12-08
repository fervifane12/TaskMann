package com.TaskManager.TaskMann.Controller;

import com.TaskManager.TaskMann.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    User user = new User(1,"john@example.com", "johndoe", "hashed_password_here", "John Doe", LocalDateTime.parse("2024-01-15T14:30:45"), LocalDateTime.parse("2024-01-15T14:30:45"));

}
