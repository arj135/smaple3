package com.main.Lambda;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
@FunctionalInterface
interface Dept{
	public String getName();
	public boolean equals(Object obj);
	public int hashCode();
	public default String getConuntryName() {
		return "Arjun";
	}
	public static String getCity() {
		return "jacksonville";
	}
	
}