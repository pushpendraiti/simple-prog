package com.java8map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortMapByValuesInJava8 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ajay", 2);
		map.put("Vijay", 5);
		map.put("Kavita", 1);
		map.put("Sangeeta", 7);
		map.put("Rajesh", 4);
		Stream<Entry<String, Integer>> sortedMap = map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue());
		sortedMap.forEach(System.out::println);
		
	}

}
