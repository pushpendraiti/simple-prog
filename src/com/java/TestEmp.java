package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(new Employee(101, "Aman", 20000.0), new Employee(102, "Suman", 15000.0),
				new Employee(103, "Sumit", 30000.0), new Employee(104, "Kavita", 40000.0),
				new Employee(105, "Aman", 25000.0), new Employee(106, "Sandeep", 20000.0));

		List<Employee> sortByNameAndSalary = empList.stream()
				.sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpSalary).reversed())
				.collect(Collectors.toList());

		sortByNameAndSalary.forEach(System.out::println);
		
		

	}

}
