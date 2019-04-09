package com.cfs.admin.models;

public class StatusResponse {

	private int statusCode;
	private String message;
	private Employee employee;
	
	public StatusResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StatusResponse(int statusCode, String message, Employee employee) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.employee = employee;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "StatusResponse [statusCode=" + statusCode + ", message=" + message + "]";
	}
	
	
	
	
}
