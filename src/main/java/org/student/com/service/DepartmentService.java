package org.student.com.service;


import java.util.List;

import org.springframework.stereotype.Service;

import org.student.com.entity.Department;
import org.student.com.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private DepartmentRepository departmentRepository;
	
	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}
	public Department createOrUpdateDepartment(Department department){
		return departmentRepository.save(department);
	}
	
	public List<Department>getDepartments(){
		return departmentRepository.findAll();
	}
	

}
