package com.dim.st.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dim.st.entities.Employee;
import com.dim.st.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
	
	// add mapping for "/list"

	@GetMapping
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Employee> theEmployees = employeeService.getAll();
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
	
	@GetMapping("/new")
	public String displayEmployeeForn(Model theModel) {
		Employee anEmployee = new Employee();
		theModel.addAttribute("employee", anEmployee);
		return "new-employee";
	}
	
	@PostMapping("/save")
	public String createEmployee(Model theModel, @Valid Employee employee, Errors errors) {
		if(errors.hasErrors())
			return "new-employee";
		
		employeeService.save(employee);
		return "redirect:/employees/new";
	}
	
	@GetMapping("/update")
	public String diplayEmployeeUpdateForm(@RequestParam("id") Integer theId, Model theModel) {
		
		Employee theEmp = employeeService.findByEmployeeId(theId);
		theModel.addAttribute("employee",theEmp);
		return "new-employee";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("id") Integer theId, Model theModel) {
		
		Employee theEmp = employeeService.findByEmployeeId(theId);
		employeeService.delete(theEmp);
		return "redirect:/employees";
	}
	
}