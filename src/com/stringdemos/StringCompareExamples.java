package com.stringdemos;

public class StringCompareExamples {

	public static void main(String[] args) {
		String s1 = "FIRST";
		String s2 = "first";
		if(s1.equals(s2)){
			System.out.println("Both Strings are equal.....");
		}
		else
		{
			System.out.println("Both Strings are not equal.....");
		}
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Both Strings are equal.....");
		}
		else
		{
			System.out.println("Both Strings are not equal.....");
		}
	}

}
