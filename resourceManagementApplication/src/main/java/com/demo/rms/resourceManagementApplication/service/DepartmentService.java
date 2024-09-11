package com.demo.rms.resourceManagementApplication.service;


import com.demo.rms.resourceManagementApplication.Mapper.DepartmentMapper;
import com.demo.rms.resourceManagementApplication.dto.DepartmentDTO;
import com.demo.rms.resourceManagementApplication.entity.Department;
import com.demo.rms.resourceManagementApplication.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    private final DepartmentMapper departmentMapper;

    public Department createDepartment(DepartmentDTO departmentDTO) {
        Department department = departmentMapper.toDepartment(departmentDTO);
        return departmentRepository.save(department);
    }
}
