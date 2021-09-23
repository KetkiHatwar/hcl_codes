package com.hcl;

public class CallByRef {
	public static int originalvalue=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The original value is "+originalvalue);
		CallByRef obj=new CallByRef();
		display(obj);
		System.out.println("The value after execution is "+originalvalue);

	}
	public static void display(CallByRef obj) {
		obj.originalvalue=15;
		System.out.println("The value inside display method is "+obj.originalvalue);
	}

}
