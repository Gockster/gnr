package com.dim.st.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dim.st.entities.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	@Override
	public List<Department> findAll();

//	@Override
//	public Optional<Department> findById(Integer dept_id);
}
