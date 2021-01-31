package com.dim.st.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dim.st.dao.DepartmentLocationsRepository;
import com.dim.st.entities.DepartmentLocations;

@RestController
@RequestMapping("app-api/deptLocations")
public class LocationApiController {
	
	@Autowired
	DepartmentLocationsRepository departmentLocationsRepository;

	@GetMapping
	public List<DepartmentLocations> getLocations(){
		return departmentLocationsRepository.findAll();
	}
	
	@GetMapping("/{id}")	  
	public DepartmentLocations getDepartmentLocationById(@PathVariable("id") int id) {
		return departmentLocationsRepository.findById(id).get();
	}
	
	
}
