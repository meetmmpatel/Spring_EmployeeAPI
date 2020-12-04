package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  
  @Column(name = "first_name", nullable = false)
  private String firstName;
  
  @Column(name = "last_name", nullable = false)
  private String lastName;
  
  @Column(name = "deptName", nullable = false)
  private String deptName;
  
  @Column(name = "is_active", nullable = false)
  private boolean isActive;
  
  @Column(name = "email", nullable = false, unique = true)
  private String email;
  
  public String getEmail() {
	return email;
  }
  
  public void setEmail(String email) {
	this.email = email;
  }
  
  public Employee() {
  }
  
  public long getId() {
	return id;
  }
  
  public void setId(long id) {
	this.id = id;
  }
  
  public String getFirstName() {
	return firstName;
  }
  
  public void setFirstName(String firstName) {
	this.firstName = firstName;
  }
  
  public String getLastName() {
	return lastName;
  }
  
  public void setLastName(String lastName) {
	this.lastName = lastName;
  }
  
  public String getDeptName() {
	return deptName;
  }
  
  public void setDeptName(String deptName) {
	this.deptName = deptName;
  }
  
  public boolean isActive() {
	return isActive;
  }
  
  public void setActive(boolean active) {
	isActive = active;
  }
}
