package com.empinfo;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String companyName;
	public Employee() {
		
	}
	public Employee(int empId, String empName, String companyName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.companyName = companyName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", companyName="
				+ companyName + "]";
	}
	
	
}
