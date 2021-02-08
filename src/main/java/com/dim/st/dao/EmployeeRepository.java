package com.dim.st.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dim.st.entities.Department;
import com.dim.st.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	
	@Override
	public List<Employee> findAll();
	
	public Employee findByEmployeeId(int theId);

	
	

}
