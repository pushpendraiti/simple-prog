package com.java;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrayListIntegerUsingJava8 {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(101);
		intList.add(102);
		intList.add(103);
		intList.add(104);
		intList.add(105);
		intList.add(106);
		int total = intList.stream().mapToInt(i -> i.intValue()).sum();
		System.out.print(total);
		System.out.println();
		int sum = intList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		
		

	}

}
