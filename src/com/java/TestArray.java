package com.java;

import java.util.stream.IntStream;

public class TestArray {

	public static void main(String[] args) {

		int arr[] = { 101, 102, 103, 104, 107, 105 };
		
		
		IntStream.range(0, arr.length).forEach(a->System.out.println(arr[a]));
	}

}
