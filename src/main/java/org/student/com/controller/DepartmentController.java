package org.student.com.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.com.entity.Department;
import org.student.com.repository.DepartmentRepository;


@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	private DepartmentRepository departmentRepository;
	
	public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}
	
	@PostMapping(path = "create")
	public ResponseEntity<Department>createDepartment(@RequestBody Department department){
		return ResponseEntity.ok(departmentRepository.save(department));
	}
	
}
