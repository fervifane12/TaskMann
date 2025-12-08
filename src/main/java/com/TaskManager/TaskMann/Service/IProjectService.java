package com.TaskManager.TaskMann.Service;

import com.TaskManager.TaskMann.DTO.ProjectDTO;

import java.util.List;

public interface IProjectService {

    List<ProjectDTO> getAllProjects (Integer user_id);
    ProjectDTO getProject (Integer project_id);
    ProjectDTO updateProject (Integer project_id);
    void deleteProject (Integer project_id);

}
