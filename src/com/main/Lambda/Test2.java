package com.main.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	while(s.hasNext()) {
		System.out.println(s.next());
	}
	}

	
	  public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		if( arr ==null || arr.size()<=0){
		     throw new IllegalArgumentException("Illegal Argument");
		}
		           int a =arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
		           int b= arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
		           return Math.abs(a-b);
		    }


}
