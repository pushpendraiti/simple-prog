//Given a list of integers, find the total number of elements present in the list using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class CountTheTotalElementInList {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,12,14,15,16,17,21,21,22,32,43);
		
		long count = intList.stream().count();
		System.out.println("Number of elements in a List :"+count);
	}

}
