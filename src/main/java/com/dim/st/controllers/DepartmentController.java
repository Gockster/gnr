package com.dim.st.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dim.st.entities.Department;
import com.dim.st.service.DepartmentService;


@Controller
@RequestMapping("/departments")
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	public DepartmentController(DepartmentService theDepartmentService) {
		departmentService = theDepartmentService;
	}
	
	@GetMapping("/list")
	public String listDepartments(Model theModel) {
		List<Department> theDepartments = departmentService.findAll();
		
		theModel.addAttribute("departments", theDepartments);
		
		return "list-departments";
	}

}
