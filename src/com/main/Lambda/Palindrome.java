package com.main.Lambda;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	String original,reverse="";
	Scanner in =new Scanner(System.in);
		original =in.nextLine();
	for(int i=original.length()-1;i>=0;i--) {
		reverse= reverse+original.charAt(i);
	}
	System.out.println("original string "+original);
	System.out.println("reverse string "+reverse);
	if(original.equals(reverse)) {
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
		
	

	}

}
