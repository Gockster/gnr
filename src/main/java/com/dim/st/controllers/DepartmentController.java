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

import com.dim.st.entities.Department;
import com.dim.st.services.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping
	public String listDepartments(Model theModel) {
		List<Department> theDepartments = departmentService.getAll();

		theModel.addAttribute("departments", theDepartments);

		return "list-departments";
	}

	@GetMapping("/new")
	public String displayDepartmentForm(Model theModel) {
		Department aDepartment = new Department();
		
		theModel.addAttribute("department", aDepartment);
		
		return "new-department";
	}
	
	@PostMapping("/save")
	public String createDepartment(Model theModel, @Valid Department department, Errors errors) {
		if(errors.hasErrors())
			return "new-department";
		
		departmentService.save(department);
		return "redirect:/departments/new";
	}
	
	@GetMapping("/update")
	public String diplayDepartmentUpdateForm(@RequestParam("id") Integer theId, Model theModel) {
		
		Department theDept = departmentService.findByDeptId(theId);
		theModel.addAttribute("department",theDept);
		return "new-department";
	}
	
	@GetMapping("/delete")
	public String deleteDepartment(@RequestParam("id") Integer theId, Model theModel) {
		
		Department theDept = departmentService.findByDeptId(theId);
		departmentService.delete(theDept);
		return "redirect:/departments";
	}

}
