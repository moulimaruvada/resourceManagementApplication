package com.demo.rms.resourceManagementApplication.dto;

import com.demo.rms.resourceManagementApplication.entity.Department;
import com.demo.rms.resourceManagementApplication.entity.Project;
import com.demo.rms.resourceManagementApplication.entity.Role;

import java.util.List;

public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private Department department;
    private Role role;
    private List<Project> projectList;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
