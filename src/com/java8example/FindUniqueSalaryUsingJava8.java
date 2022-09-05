//Write a program for find list of unique salary from List of Employee, please follow below class 
//	 for creating list
package com.java8example;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int eid;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class FindUniqueSalaryUsingJava8 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Aman", 23000.0));
		empList.add(new Employee(102, "Vijay", 24000.0));
		empList.add(new Employee(103, "Kavita", 23000.0));
		empList.add(new Employee(104, "Sumit", 23500.0));
		empList.add(new Employee(105, "Ankesh", 25000.0));
		empList.add(new Employee(106, "Manish", 25000.0));
		empList.stream().map(Employee::getSalary).distinct().forEach(System.out::println);

		System.out.println();
		String string = empList.stream().map(Employee::getName).filter(n -> n.startsWith("Aman")).findFirst().get();

		System.out.println("First Name is : " + string);

	}

}
