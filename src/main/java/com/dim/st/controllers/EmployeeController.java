package com.dim.st.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dim.st.dao.EmployeeRepository;
import com.dim.st.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
    EmployeeRepository employeeRepository;
	
	// add mapping for "/list"

	@GetMapping
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Employee> theEmployees = employeeRepository.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}