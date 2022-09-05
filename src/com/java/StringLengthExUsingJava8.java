package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthExUsingJava8 {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Kavita","Aman","Pushpendra","Sunita","Yash Pal","Vishal");
		List<String> collect = asList.stream().filter(a->a.length()>5).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		
	}

}
