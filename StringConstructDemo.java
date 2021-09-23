package com.hcl;

public class StringConstructDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= new String();
char chars[]={'h','e','l','l','o'};
String s2= new String(chars);	
byte bytes[] = {'w','o','r','l','d'};
String s3= new String(bytes);
String s4= new String(chars,1,3);
String s5= new String(s2);
String s6= s2;
//String s7;literals
String s8="ketki";
s8="sakshi";//updated

String s9=new String("ABCD");
s9="xyz";//new reference is created 

System.out.println(s8);
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
//System.out.println(s7);literals
System.out.println(s9);
	}

}
