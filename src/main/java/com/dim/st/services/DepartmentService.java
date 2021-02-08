package com.dim.st.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dim.st.dao.DepartmentRepository;
import com.dim.st.entities.Department;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	public Department save(Department department) {
		return departmentRepository.save(department);
	}


	public List<Department> getAll() {
		return departmentRepository.findAll();
	}


	public Department findByDeptId(Integer theId) {
		return departmentRepository.findByDeptId(theId);
	}


	public void delete(Department theDept) {
		departmentRepository.delete(theDept);
		
	}

}
