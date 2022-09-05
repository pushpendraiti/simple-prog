//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberFromIntListUsingStream {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,14,15,16,17);
		intList.stream().filter(a->a%2==0).forEach(System.out::println);
		System.out.println();
		intList.stream().filter(a->a%2==0).forEach(n->System.out.print(n+" "));
	}

}
