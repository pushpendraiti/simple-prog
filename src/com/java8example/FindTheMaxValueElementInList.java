//Given a list of integers, find the maximum value element present in it using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class FindTheMaxValueElementInList {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,12,14,15,16,17,21,21,22,32,43);
		Integer integer = intList.stream().max(Integer::compare).get();
		System.out.println("Max element is :"+integer);
	}

}
