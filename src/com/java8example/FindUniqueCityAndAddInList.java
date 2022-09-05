//Write a program for concate all unique city with given format and create Employe list with follow given Employee Class
	//[Chicago , New York, Hostan]
package com.java8example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
	private int eid;
	private String empName;
	private double salary;
	private String city;
	public Employee1() {
		
	}
	public Employee1(int eid, String empName, double salary, String city) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.salary = salary;
		this.city = city;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", empName=" + empName + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
}
public class FindUniqueCityAndAddInList {

	public static void main(String[] args) {
		
		List<Employee1> empList=new ArrayList<>();
		
		List<String> cityList=new ArrayList<>();
		
		empList.add(new Employee1(101, "Aman", 23000.0,"Chicago"));
		empList.add(new Employee1(102, "Vijay", 24000.0,"Hostan"));
		empList.add(new Employee1(103, "Kavita", 23000.0,"New York"));
		empList.add(new Employee1(104, "Sumit", 23500.0,"Hostan"));
		empList.add(new Employee1(105, "Ankesh", 25000.0,"Chicago"));
		empList.add(new Employee1(106, "Manish", 25000.0,"New York"));
		
		List<String> collect = empList.stream().map(Employee1::getCity).distinct().filter(a->cityList.add(a)).collect(Collectors.toList());
		collect.forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println(collect);
	}

}
