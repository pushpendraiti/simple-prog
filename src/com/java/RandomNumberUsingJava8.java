package com.java;

import java.util.Random;

public class RandomNumberUsingJava8 {

	public static void main(String[] args) {
		Random random = new Random();
//		random.ints().limit(5).forEach(System.out::println);
		int nextInt = random.nextInt(999999);
		System.out.println("Random number : "+nextInt);
		
		
	}

}
