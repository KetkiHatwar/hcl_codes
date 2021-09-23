package com.hcl;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalvalue=15;
		System.out.println("The original value is "+originalvalue);
		display(originalvalue);
		System.out.println("The value after execution of display function "+originalvalue);
	}
	public static int display(int x) {
		x=25;
		System.out.println("The value in the funtion is "+x);
		return x;
	}

}
