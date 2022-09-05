package com.empinfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Aman", "InfoAxon", 45000.0));
		empList.add(new Employee(102, "Vikas", "TCS", 45000.0));
		empList.add(new Employee(103, "Kavita", "Wipro", 50000.0));
		empList.add(new Employee(104, "Aman", "HCL", 47000.0));
		empList.add(new Employee(105, "Kanika", "Iris", 45000.0));
		Employee empName = empList.stream().filter(emp -> emp.getEmpName().equals("vijay")).findFirst().orElse(null);
		Optional<Employee> empData = empList.stream().filter(emp -> emp.getEmpName().equals("Aman")).findFirst();
		/*
		 * if(empName!=null) { System.out.println("Name is :"+empName.getEmpName()); }
		 * else { System.out.println("Name is not present"); }
		 */
		//String str=empName!=null ? empName.getEmpName():"Name is not present";
		System.out.println(empName != null ? empName.getEmpName() : "Name is not present");
		
		List<Employee> sortedRecords = empList.stream().sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpSalary)).collect(Collectors.toList());
		sortedRecords.forEach(System.out::println);
		
	}

}
