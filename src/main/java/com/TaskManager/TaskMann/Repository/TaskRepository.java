package com.TaskManager.TaskMann.Repository;

import com.TaskManager.TaskMann.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Integer> {

}