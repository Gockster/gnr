package com.dim.st.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dim.st.dao.EmployeeRepository;
import com.dim.st.entities.Employee;

@RestController
@RequestMapping("app-api/employees")
public class EmployeeApiController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeRepository.findById(id).get();
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") int id) {
		try {
		employeeRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			
		}
	}
	
}
