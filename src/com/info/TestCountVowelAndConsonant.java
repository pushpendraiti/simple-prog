package com.info;

public class TestCountVowelAndConsonant {

	public static void main(String[] args) {
		// Count variable to store the count of vowels and consonant
		int vCount = 0, cCount = 0;
		// Declare a string
		String str = "This is a really simple sentence";
		// Converting entire string to lower case to reduce the comparisons
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				vCount++;
			} else if (ch1 >= 'a' && ch1 <= 'z') {
				cCount++;
			}
		}
		System.out.println("Total vowels are : " + vCount);
		System.out.println("Total consonant are : " + cCount);
	}

}
