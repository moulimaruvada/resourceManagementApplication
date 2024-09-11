package com.demo.rms.resourceManagementApplication.Mapper;

import com.demo.rms.resourceManagementApplication.dto.ProjectDTO;
import com.demo.rms.resourceManagementApplication.entity.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectMapper {

    public Project toProject(ProjectDTO projectDTO) {
        return Project.builder().projectName(projectDTO.getProjectName())
                .client(projectDTO.getClient())
                .employees(projectDTO.getEmployees()).build();
    }
}
