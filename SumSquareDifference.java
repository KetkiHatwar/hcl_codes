package com.hcl;

import java.util.Scanner;

public class SumSquareDifference {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]=new int[101];
	for(int i=1;i<=100;i++) {
		arr[i]=i*i;
		
	}
	int sum=0;
	for(int i=1;i<=100;i++) {
		 sum=sum+arr[i];
		}
	int add=0;
	int arr1[]=new int[101];
	for(int i=1;i<=100;i++) {
		arr1[i]=i;
	}
	for(int i=1;i<=100;i++) {
		add=add+arr1[i];
	}
	int x=(add*add)-sum;

	System.out.println(x);
	}

}

