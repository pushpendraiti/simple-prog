//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
package com.java8example;

import java.util.Arrays;
import java.util.List;

public class FindIntNumStartWith1 {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(12,13,14,15,16,17,21,22,32,43);
		intList.stream().map(a->a+"").filter(s->s.startsWith("1")).forEach(n->System.out.print(n+" "));
	}

}
