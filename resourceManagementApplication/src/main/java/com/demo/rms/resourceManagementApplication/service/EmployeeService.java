package com.demo.rms.resourceManagementApplication.service;

import com.demo.rms.resourceManagementApplication.Mapper.EmployeeMapper;
import com.demo.rms.resourceManagementApplication.dto.CreateEmployeeDTO;
import com.demo.rms.resourceManagementApplication.dto.EmployeeDTO;
import com.demo.rms.resourceManagementApplication.entity.Employee;
import com.demo.rms.resourceManagementApplication.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public Employee createEmployee(EmployeeDTO employeeDTO){
        Employee employee = employeeMapper.toEmployee(employeeDTO);
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployeeWithDepartment(CreateEmployeeDTO createEmployeeDTO){
        Employee employee = employeeMapper.toEmployee(createEmployeeDTO);
        return employeeRepository.save(employee);
    }
}
