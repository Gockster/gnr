package com.dim.st.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dim.st.dao.EmployeeRepository;
import com.dim.st.entities.Employee;



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	
	public Employee findByEmployeeId(int theId) {
		return employeeRepository.findByEmployeeId(theId);
	}

	public void delete(Employee theEmp) {
		employeeRepository.delete(theEmp);
		
	}
	
	

}
