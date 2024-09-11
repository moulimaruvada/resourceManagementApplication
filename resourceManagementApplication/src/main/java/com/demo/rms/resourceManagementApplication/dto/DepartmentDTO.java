package com.demo.rms.resourceManagementApplication.dto;


import com.demo.rms.resourceManagementApplication.entity.Employee;
import lombok.Data;

import java.util.List;

@Data
public class DepartmentDTO {

    private String departmentName;
    private List<Employee> employees;
}
