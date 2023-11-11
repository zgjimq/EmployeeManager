package org.student.com.controller;
import org.student.com.repository.DepartmentRepository;

public class DepartmentController {
	private DepartmentRepository departmentRepository;
	
	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}
	
	
}
