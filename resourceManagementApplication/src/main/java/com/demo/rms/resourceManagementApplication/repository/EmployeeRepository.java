package com.demo.rms.resourceManagementApplication.repository;

import com.demo.rms.resourceManagementApplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
