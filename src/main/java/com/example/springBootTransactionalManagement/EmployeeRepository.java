package com.example.springBootTransactionalManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springBootTransactionalManagement.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

