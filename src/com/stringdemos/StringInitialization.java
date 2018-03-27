package com.stringdemos;

public class StringInitialization {

	public static void main(String[] args) {
		String abc = "This is new String Object.";
		String bcd = new String("This is another String object");
		char c[] = {'a','b','c','d','e'};
		String another = new String(c);
		String finalString = abc+"This is another String for the first";

	}

}
