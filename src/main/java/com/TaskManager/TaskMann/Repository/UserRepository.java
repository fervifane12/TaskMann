package com.TaskManager.TaskMann.Repository;

import com.TaskManager.TaskMann.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {

}
