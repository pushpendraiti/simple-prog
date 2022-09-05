package com.info;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello java");
		String str = "The best of both word";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("Total character are :" + count);
	}

}
