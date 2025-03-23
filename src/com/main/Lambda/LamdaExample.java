package com.main.Lambda;

public class LamdaExample {
   public static void main(String args[]) {

	NumberTest test=n->n%2==0;
	System.out.println(test.isEven(10));
    }

}
interface NumberTest<T>{
	T isEven(int T);
}