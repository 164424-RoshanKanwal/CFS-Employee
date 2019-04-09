 package com.cfs.admin.models;

public class Employee {

	private long empId;
	private String email;
	private String fullName;
	private String password;
	private long contact;
	private String role;
	
	
	public Employee() {
		
	}


	public Employee(long empId, String email, String fullName, String password, long contact, String role) {
		super();
		this.empId = empId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.contact = contact;
		this.role = role;
		
	}

	

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public long getempId() {
		return empId;
	}


	public void setempId(long empId) {
		this.empId = empId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "NewEmployee [empId=" + empId + ", email=" + email + ", fullName=" + fullName + ", password="
				+ password + ", contact=" + contact + "]";
	}
	
	
}
