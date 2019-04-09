package com.cfs.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cfs.admin.models.Employee;
import com.cfs.admin.models.LoginCredentials;
import com.cfs.admin.models.StatusResponseV2;
import com.cfs.admin.services.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;

	@PostMapping("/login")
	public ResponseEntity<Employee> validateEmployee(@RequestBody LoginCredentials loginCredentials) {
		
		Employee employee = employeeService.validate(loginCredentials);
		return new ResponseEntity<Employee>(employee,  new HttpHeaders(), HttpStatus.OK);
	
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<StatusResponseV2> registerEmployee(@RequestBody Employee newEmployee) {
		return employeeService.register(newEmployee);
	}
	
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		
		return new ResponseEntity<Employee>(employee,  new HttpHeaders(), HttpStatus.OK);
	}
}
