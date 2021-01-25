package com.dim.st.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dim.st.entities.Department;
import com.dim.st.entities.Employee;
import com.dim.st.service.DepartmentService;
import com.dim.st.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	public HomeController(EmployeeService theEmployeeService, DepartmentService theDepartmentService) {
		employeeService = theEmployeeService;
		departmentService = theDepartmentService;
	}
	
	

	@GetMapping("/")
	public String displayHome(Model theModel) {

		List<Employee> theEmployees = employeeService.findAll();
		theModel.addAttribute("employees", theEmployees);
		
		List<Department> theDepartments = departmentService.findAll();
		theModel.addAttribute("departments", theDepartments);
		
		return "home";
		
	}

}
