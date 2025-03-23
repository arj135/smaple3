package com.main.Lambda;

interface Temp{
	void add(int x);
	public String toString();
	public boolean equals(Object obj);
	public default void sub() {
		System.out.println("sub");
	}
}
public class LambdaClass extends Temp1{

	public static void main(String[] args) {
		Temp t=(int x)->System.out.println("value"+x);
			
		t.add(10);
		t.sub();
		Temp l1 = new LambdaClass();
		l1.sub();
	}
		
}
		

class Temp1 implements Temp{

	@Override
	public void add(int x) {
		// TODO Auto-generated method stub
		
	}
	public  void sub() {
		System.out.println("sub1");
	}
}