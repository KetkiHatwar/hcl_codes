package com.hcl;

public class StringBuilderApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Hello");
		str.append(" World");
		System.out.println(str);
		str.insert(5,"_Java");
		System.out.println(str);
		str.replace(5, 6," ");
		System.out.println(str);
		
			
	}

}
