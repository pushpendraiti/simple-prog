//Given a list of integers, sort all the values present in it using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class SortListElements {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(21,21,22,32,43,12,13,12,14,15,16,17,1,51);
	    intList.stream().sorted().forEach(n->System.out.print(n+" "));
	}

}
