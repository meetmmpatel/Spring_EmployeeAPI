package com.example.demo.controller;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
  
  
  @Autowired
  private EmployeeRepository employeeRepository;
  
  @GetMapping("/employees")
  public Page<Employee> getListOfEmployee(Pageable pageable) {
	return employeeRepository.findAll(pageable);
  }
  
  @GetMapping("/employees/{id}")
  public ResponseEntity<Employee> getOneEmployee(@PathVariable(value = "id") long id)
		  throws EmployeeNotFoundException {
    
	Employee employee = employeeRepository.findById(id)
			.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with given id: " + id));
	return ResponseEntity.ok().body(employee);
	
  }
  
  @PostMapping("/employees")
  public Employee addEmployee(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
  }
  
  
}
