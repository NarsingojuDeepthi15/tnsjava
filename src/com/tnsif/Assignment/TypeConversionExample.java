package com.tnsif.Assignment;

public class TypeConversionExample {

	public static void main(String[] args) {
		System.out.println("---Implicit Type Conversion---");
		int a=10;
		double b=a;
		System.out.println("Integer value:"+a);
		System.out.println("Converted to double:"+b);
		char ch='A';
		int ascii=ch;
		System.out.println("Character:"+ch);
		System.out.println("Ascii value:"+ascii);
		
		System.out.println("---Explicit Type Conversion---");
		double d=56.76;
		int n=(int)d;
		System.out.println("Double value:"+d);
		System.out.println("Converted to Integer:"+n);
		int num=130;
		byte bt=(byte)num;
		System.out.println("Integer value:"+num);
		System.out.println("Converted to byte:"+bt);
		
		// TODO Auto-generated method stub

	}

}
