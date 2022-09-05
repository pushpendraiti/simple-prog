package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {

	public static void main(String[] args) {

		// creating a list of Prime Numbers
		List<Integer> primeNumber = Arrays.asList(5, 7, 11, 13);
		// creating a list of Odd Numbers
		List<Integer> oddNumber = Arrays.asList(1, 3, 5);
		// creating a list of Numbers
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);

		List<List<Integer>> listOfints = Arrays.asList(primeNumber, oddNumber, evenNumbers);
		System.out.println("The Structure before flattening is : " + listOfints);
		// using flatMap for transformating and flattening
		List<Integer> collectNumList = listOfints.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println("The structure after flattening is : "+collectNumList);
		
		
	}

}
