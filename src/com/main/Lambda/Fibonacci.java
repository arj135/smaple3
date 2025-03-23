package com.main.Lambda;

public class Fibonacci {

	public static void main(String[] args) {
		int count =10;
		int n1=0;
		int n2=1;
		for(int i=0;i<count;i++) {
			if(i==0) {
				System.out.println("0");
			}
			if(i==1)
			{
			System.out.println("1");	
			}
			else {
				int sum= n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
				
			}
			}

	}

}
