package com.dim.st.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dim.st.dao.DepartmentRepository;
import com.dim.st.entities.Department;

@RestController
@RequestMapping("app-api/departments")
public class DepartmentApiController {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping
	public List<Department> getDepartments(){
		return departmentRepository.findAll();	
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") int id) {
		return departmentRepository.findById(id).get();
	}
	
}
