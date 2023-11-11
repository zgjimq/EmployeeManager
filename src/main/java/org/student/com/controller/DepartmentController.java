package org.student.com.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.com.repository.DepartmentRepository;


@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	private DepartmentRepository departmentRepository;
	
	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}
	
	
}
