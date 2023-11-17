package org.student.com.service;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	public ResponseEntity<?> deleteById(Long id){
		Department department=  departmentRepository.findById(id).orElse(null);
		
		if(department!=null) {
			departmentRepository.deleteById(id);
			String messageString="U have deleted the department with id:"+id;
			return ResponseEntity.ok().body(messageString);
		}
		else {
			String messageString = "This id does not exist";
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(messageString);
		}
		
	}

}
