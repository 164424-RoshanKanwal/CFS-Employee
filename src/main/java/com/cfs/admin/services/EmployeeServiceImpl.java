package com.cfs.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cfs.admin.models.Employee;
import com.cfs.admin.models.LoginCredentials;
import com.cfs.admin.models.StatusResponseV2;


@Service
public class EmployeeServiceImpl implements EmployeeService, AdminService{

	@Autowired
	RestTemplate restTemplate;
	

	final String baseURL = "http://localhost:9000/employee";
	
	@Override
	public Employee validate(LoginCredentials loginCredentials) {
		
	    Employee result = restTemplate.postForObject(baseURL + "/{empId}",loginCredentials, Employee.class, loginCredentials.getEmpId());
		System.out.println(result.getEmail());
		return result;
	}

	@Override
	public ResponseEntity<StatusResponseV2> register(Employee newEmployee) {
		
		ResponseEntity<StatusResponseV2> status = restTemplate.postForEntity(baseURL, newEmployee, StatusResponseV2.class);
		return status;
		
	}

	
	@Override
	public String forgotPassword() {
		//future implementation
		return null;
	}


}
