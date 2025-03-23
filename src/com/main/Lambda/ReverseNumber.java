package com.main.Lambda;

public class ReverseNumber {
	public static void main(String[] args) {
	
		int number=2346;
		String numString =String.valueOf(number);
		System.out.println(new StringBuffer(numString).reverse().toString());
		
	}
	
	public static int reverseNumber(int number) {
		int reverseNumebr =0;
		while(number>0) {
			reverseNumebr= reverseNumebr * 10 + number%10;
			number =number/10;
			
		}
		return reverseNumebr;
	}

}
