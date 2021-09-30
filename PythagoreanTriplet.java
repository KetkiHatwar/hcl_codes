package com.hcl;

public class PythagoreanTriplet {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1;
for(int a=1;a<=1000;a++) {
	for(int b=1;b<=1000;b++) {
		for(int c=1;c<=1000;c++) {
			if((a*a + b*b == c*c) && ((a+b+c) ==1000)) {
				product=(a*b*c);
				
			}
		}
	}
}
System.out.println(product);
	}
}
