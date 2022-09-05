package com.java;

import java.util.List;
import java.util.function.Predicate;

public class Java8AnyMatchExample {

	public static void main(String[] args) {
		Predicate<EmployeeAnyMatch> p1=e->e.geteName().startsWith("A");
		Predicate<EmployeeAnyMatch> p2=e->e.geteAge()<32&&e.geteName().startsWith("K");
		List<EmployeeAnyMatch> list=EmployeeAnyMatch.getEmployee();
		boolean m1 = list.stream().anyMatch(p1);
		System.out.println(m1);
		boolean m2 = list.stream().anyMatch(p2);
		System.out.println(m2);
		
	}

}
