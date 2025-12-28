package com.tnsif.Assignment;

public class ReverseString {

	public static void main(String[] args) {
		  String originalString = "Hello, World!";
	        StringBuilder stringBuilder = new StringBuilder(originalString);
	        stringBuilder.reverse();
	        String reversedString = stringBuilder.toString();
	        System.out.println("Original string: " + originalString);
	        System.out.println("Reversed string: " + reversedString);
		
	}

}
