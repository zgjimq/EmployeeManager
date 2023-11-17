package org.student.com.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.com.entity.Department;
import org.student.com.service.DepartmentService;


@RestController
@RequestMapping("/api/departments")
@CrossOrigin
public class DepartmentController {
	
	//private DepartmentRepository departmentRepository;
	
	/*public DepartmentController(DepartmentRepository departmentRepository) {
		this.departmentRepository=departmentRepository;
	}
	
	@PostMapping(path = "create")
	public ResponseEntity<Department>createDepartment(@RequestBody Department department){
		return ResponseEntity.ok(departmentRepository.save(department));
	}
	@GetMapping(path = "get")
	public List<Department>getDepartments(){
		return departmentRepository.findAll();
	}*/
	private final DepartmentService departmentService;
	
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService=departmentService;
	}
	
	@PostMapping(path = "/createOrUpdate")
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.createOrUpdateDepartment(department);
	}
	@GetMapping(path = "/getAll")
	public List<Department>getAllDepartments(){
		return departmentService.getDepartments();
	}
	@DeleteMapping(path = "/deleteById/{id}")
	public ResponseEntity<?>deleteDepartment(@PathVariable Long id){
		return departmentService.deleteById(id);
	}
	@GetMapping(path = "/getById/{id}")
	public Department getDepartmentById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	}
}
