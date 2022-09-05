package com.java8example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheSumOfMapValuesUsingStream {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 100);
		map.put("2", 200);
		map.put("3", null); // this is invalid number
		map.put("4", 400);
		map.put("5", null);
		//int sum = map.values().stream().mapToInt(Integer::intValue).sum();
		//System.out.println("Sum of map values : "+sum);
		Map<String, Integer> newMap = map.entrySet().stream().filter(k->k.getValue()!=null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		int sum2 = newMap.values().stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum Of Map values :"+sum2);
	}

}
