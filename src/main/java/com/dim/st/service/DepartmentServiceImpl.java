package com.dim.st.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dim.st.dao.DepartmentRepository;
import com.dim.st.entities.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentRepository departmentRepository;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository theDepartmentRepository) {
		departmentRepository = theDepartmentRepository;
	}

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

}
