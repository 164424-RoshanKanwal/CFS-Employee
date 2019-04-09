package com.cfs.admin.services;

import org.springframework.http.ResponseEntity;

import com.cfs.admin.models.Employee;
import com.cfs.admin.models.LoginCredentials;
import com.cfs.admin.models.StatusResponseV2;

public interface EmployeeService {

	Employee validate(LoginCredentials loginCredentials);
	ResponseEntity<StatusResponseV2> register(Employee employee);
	String forgotPassword();
	
}
  