package com.dim.st.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dim.st.dao.DepartmentLocationsRepository;
import com.dim.st.entities.DepartmentLocations;

@Controller
@RequestMapping("/locations")
public class LocationController {
	
	@Autowired
	DepartmentLocationsRepository departmentLocationsRepository;
	
	@GetMapping
	public String listLocations(Model theModel) {
		List<DepartmentLocations> theLocs = departmentLocationsRepository.findAll();
		
		theModel.addAttribute("locs", theLocs);
		
		return "list-locations";
		
	}
	

}
