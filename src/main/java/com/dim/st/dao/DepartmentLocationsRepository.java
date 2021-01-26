package com.dim.st.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dim.st.entities.DepartmentLocations;

public interface DepartmentLocationsRepository extends JpaRepository< DepartmentLocations, Integer>{
		
		@Override
		public List< DepartmentLocations> findAll();

	}



