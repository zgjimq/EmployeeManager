package org.student.com.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	//departmentNumber, departmentOwnersName, departmentOwnersPhoneNr
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Department_Id")
	private Long id;
	@Column(name = "Department_Name")
	private String departmentName;
	@Column(name = "Department_Phone_Number")
	private String departmentPhoneNr;
	
	public Department() {
		super();
	}
	public Department(Long id, String departmentName, String departmentPhoneNr) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentPhoneNr = departmentPhoneNr;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentPhoneNr() {
		return departmentPhoneNr;
	}
	public void setDepartmentPhoneNr(String departmentPhoneNr) {
		this.departmentPhoneNr = departmentPhoneNr;
	}
	
	
	
	
	
	
}
