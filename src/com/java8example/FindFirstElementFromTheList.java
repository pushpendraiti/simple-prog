//Given the list of integers, find the first element of the list using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElementFromTheList {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,12,14,15,16,17,21,21,22,32,43);
		Optional<Integer> findFirst = intList.stream().findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		//Or
		Integer integer = intList.stream().findFirst().get();
		System.out.println(integer);
		
		
		
	}

}
