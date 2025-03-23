package com.main.Lambda;

import java.text.DecimalFormat;

public class TwoDecimalRoundup {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
String sal="12333.167";
Double input = Double.valueOf(sal);
	    

	       // Double input = 3.146;
String  savingsAmount =df.format(input);
	        System.out.println("double : " + input);
	        System.out.println("double : " + df.format(input));    //3.14

	}

}
