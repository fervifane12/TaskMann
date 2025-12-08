package com.TaskManager.TaskMann.Repository;

import com.TaskManager.TaskMann.Model.Project;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Integer> {
}
