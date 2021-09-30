package com.hcl;

public class FactorialDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1;
for (int i=1;i<=10;i++) {
	fact=fact*i;
}
String fact1 = ""+fact;
int sum = 0;
for (int i = 0; i < fact1.length(); i++) {
	sum += fact1.charAt(i) - '0';//actual integer value is considered otherwise charAt will give char value
	}
System.out.println(fact);
System.out.print(Integer.toString(sum));

	}

}
