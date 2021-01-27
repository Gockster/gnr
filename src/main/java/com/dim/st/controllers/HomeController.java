package com.dim.st.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dim.st.dao.DepartmentLocationsRepository;
import com.dim.st.dao.DepartmentRepository;
import com.dim.st.dao.EmployeeRepository;
import com.dim.st.entities.Department;
import com.dim.st.entities.DepartmentLocations;
import com.dim.st.entities.Employee;

@Controller
public class HomeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired 
	DepartmentRepository departmentRepository;
	
	@Autowired 
	DepartmentLocationsRepository departmentLocationsRepository;
	 
	
	@GetMapping("/")
	public String displayHome(Model theModel) {

		List<Employee> theEmployees = employeeRepository.findAll();
		theModel.addAttribute("employees", theEmployees);
		
		List<Department> theDepartments = departmentRepository.findAll();
		theModel.addAttribute("departments", theDepartments);
		
		List<DepartmentLocations> theLocs = departmentLocationsRepository.findAll();
		theModel.addAttribute("locs", theLocs);
		
		return "home";
		
	}

}
