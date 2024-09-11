package com.demo.rms.resourceManagementApplication.Mapper;

import com.demo.rms.resourceManagementApplication.dto.DepartmentDTO;
import com.demo.rms.resourceManagementApplication.entity.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentMapper {

    public Department toDepartment(DepartmentDTO departmentDTO) {
        return Department.builder().departmentName(departmentDTO.getDepartmentName())
                .employees(departmentDTO.getEmployees()).build();
    }
}
