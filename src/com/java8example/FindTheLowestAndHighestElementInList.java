//Write a program to find the lowest and highest number of a Stream with the uses of comparator in java 8
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class FindTheLowestAndHighestElementInList {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(21,21,22,32,43,12,13,12,14,15,16,17,1,51);
		Integer max = intList.stream().max(Integer::compare).get();
		System.out.println("Max Num is : "+max);
		Integer min = intList.stream().min(Integer::compare).get();
		System.out.println("Max Num is : "+min);
		
	}

}
