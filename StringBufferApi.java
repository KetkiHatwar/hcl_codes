package com.hcl;

import java.util.Scanner;

public class StringBufferApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringBuffer str=new StringBuffer("Hello");
str.append(" World");
System.out.println(str);
str.insert(5,"_Java");
System.out.println(str);
str.replace(5, 6," ");
System.out.println(str);
System.out.println(str.charAt(6));
str.delete(2, 3);
System.out.println(str);
System.out.println(str.capacity());
str.reverse();
System.out.println(str);
	}

}
