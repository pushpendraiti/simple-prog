package com.java;

import java.util.stream.Stream;

public class Java8IterateExample {

	public static void main(String[] args) {
		Stream<Integer> limit = Stream.iterate(1,count->count+1).filter(a->a%3==0).limit(10);
		limit.forEach(c->System.out.print(c+" "));
		
	}

}
