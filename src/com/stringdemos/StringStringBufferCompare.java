package com.stringdemos;

public class StringStringBufferCompare {

	public static void main(String[] args) {
		String s = "This is the string we need to compare";
		StringBuffer sb = new StringBuffer("This is the string we need to compare");
		
		if(s.contentEquals(sb)){
			System.out.println("two strings are equal.....");
		}else{
			System.out.println("Two strings are not equal.......");
		}
		
		StringBuffer sb1 = new StringBuffer("This is not the string buffer need to compare....");
		if(s.contentEquals(sb1)){
			System.out.println("Two strings are equal........");
		}else{
			System.out.println("Two strings are not equal.....");
		}
		
	}

}
