package com.datastructures;

import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		if(sc.hasNextInt()) {
			System.out.println(factorial(sc.nextInt()));
			
		}

	}

	
	public  static int factorial(int n) {
	 int res=0;
	
		if( n == 0 || n == 1)  
			return 1;
		     
		else 
		  res= n * factorial(n -1);
		return res;
	}
}
