package com.datastructures;

public class ValidTriangle {
	public static void main(String[] args) {
		int isvalid =isValidTriangle(4, 5, 3);
		if(isvalid==1) {
			System.out.println("valid Triangle");
		}if(isvalid==0) {
			System.out.println("Not valid Triangle");
		}

	}
	
	public  static int isValidTriangle(int a,int b,int c) {
		if(a+b <=c || b+c <=a || a+c <= b)
		{
			return 0;
		}else {
			return 1;
		}
	}

}
