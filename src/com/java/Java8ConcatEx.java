package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8ConcatEx {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("A", "B", "C");
		List<String> l2 = Arrays.asList("Aman", "Pushpendra", "Vikas");
		Stream<String> concatStream = Stream.concat(l1.stream(), l2.stream());
		
		concatStream.forEach(str -> System.out.print(str + " "));
		
		
	}

}
