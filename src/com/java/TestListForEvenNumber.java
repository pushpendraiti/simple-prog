package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestListForEvenNumber {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(4);
		ints.add(9);
		ints.add(6);
		ints.add(19);
		ints.add(22);
		ints.add(16);
		ints.add(23);
		/*List<Integer> collectList = ints.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		collectList.forEach(System.out::println);*/
		
		Stream<String> filter = ints.stream().map(a->String.valueOf(a)).filter(c->c.startsWith("1"));
		
			filter.forEach(System.out::println);
	}

}
