package com.cfs.admin.services;

import com.cfs.admin.models.Employee;
import com.cfs.admin.models.LoginCredentials;

public interface AdminService {//this interface can be used for future enhancement
	Employee validate(LoginCredentials loginCredentials);
	
}
