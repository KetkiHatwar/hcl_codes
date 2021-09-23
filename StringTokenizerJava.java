package com.hcl;

import java.util.StringTokenizer;

public class StringTokenizerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer s=new StringTokenizer("My name is Ketki");
		while(s.hasMoreTokens()) {
			System.out.print(s.nextToken(" "));
		}
	}

}
