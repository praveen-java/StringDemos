package com.stringdemos;

public class StringConcateDemo {

	public static void main(String[] args) {
		String a = "One";
		String b = "Two";
		System.out.print("Concatinated String is :: ");
		String c = a + b;
		System.out.println(c);
		
		System.out.print("In another way also ::");
		String d = a.concat(b);
		System.out.println(d);
		
		System.out.print("Both are Same :: ");
		System.out.println(c.compareTo(d) == 0?true:false);
	}

}
