package com.hcl;

public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Today  is an awesome day");
		System.out.println(s);
		System.out.println(s.charAt(4));
		System.out.println("Is today an awesome day? "+s.compareTo("Today  is an awesome day"));
		System.out.println("Is today an awesome day? "+s.equals("Today  is not an awesome day"));
		System.out.println("Length "+s.length());
		System.out.println("Index of y "+s.indexOf('a'));
		String t=s.substring(2,9);
		System.out.println(t);

	}

}
