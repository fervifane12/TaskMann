package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService {

    @Override
    public List<ProjectDTO> getAllProjects(Integer user_id) {
        return List.of();
    }

    @Override
    public ProjectDTO getProject(Integer project_id) {
        return null;
    }

    @Override
    public ProjectDTO updateProject(Integer project_id) {
        return null;
    }

    @Override
    public void deleteProject(Integer project_id) {

    }
}
