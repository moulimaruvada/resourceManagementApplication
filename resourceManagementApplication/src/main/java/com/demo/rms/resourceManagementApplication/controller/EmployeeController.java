package com.demo.rms.resourceManagementApplication.controller;

import com.demo.rms.resourceManagementApplication.dto.CreateEmployeeDTO;
import com.demo.rms.resourceManagementApplication.dto.EmployeeDTO;
import com.demo.rms.resourceManagementApplication.entity.Employee;
import com.demo.rms.resourceManagementApplication.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rms/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO){
       Employee employee = employeeService.createEmployee(employeeDTO);
       return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployeeWithDepartment(@RequestBody CreateEmployeeDTO createEmployeeDTO){
        Employee employee = employeeService.createEmployeeWithDepartment(createEmployeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
