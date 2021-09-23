package com.hcl;
import java.util.*;
import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId[]=new int[5];
		empId[0]=101;
		empId[1]=102;
		empId[2]=103;
		empId[3]=104;
		empId[4]=105;
		int sum=0;
		for (int i=0;i<empId.length;i++) {
			sum=empId[i]+sum;
			
		}
		System.out.println(sum);

	}

}
