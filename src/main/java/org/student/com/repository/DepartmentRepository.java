package org.student.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.com.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	public Optional<Department> findById(Long id);
}
