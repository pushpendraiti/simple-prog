//How to find duplicate elements in a given integers list in java using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateIntFromList {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,12,14,15,16,17,21,21,22,32,43);
		Set<Integer> set=new HashSet<>();
		intList.stream().filter(n->!set.add(n)).forEach(a->System.out.print(a+" "));
	}

}
