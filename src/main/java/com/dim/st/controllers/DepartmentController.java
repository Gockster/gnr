package com.dim.st.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dim.st.dao.DepartmentRepository;
import com.dim.st.entities.Department;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping
	public String listDepartments(Model theModel) {
		List<Department> theDepartments = departmentRepository.findAll();
		
		theModel.addAttribute("departments", theDepartments);
		
		return "list-departments";
	}
	

}
