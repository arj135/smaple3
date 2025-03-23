package com.main.Lambda;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(23));
		
	}
	public static boolean isPrime(int number) {
		if(number<=1)
			return false;
		
			for(int i=2;i<number-1;i++) {
				if(number%i==0)
					return false;
			}
			return true;
	}
		
	
}
