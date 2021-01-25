package com.dim.st.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dim.st.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
