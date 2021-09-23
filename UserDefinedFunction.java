package com.hcl;

public class UserDefinedFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double number=8;
double result=0;
UserDefinedFunction o=new UserDefinedFunction();
result=o.cube(number);
System.out.println(result);
	}
public static double cube(double number){
	double cubevalue=number*number*number;
	return cubevalue;
}
}
