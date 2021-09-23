package com.hcl;

public class EvenOddPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId[]=new int[5];
		empId[0]=101;
		empId[1]=102;
		empId[2]=103;
		empId[3]=104;
		empId[4]=105;
		System.out.println("Even position : ");
		for (int i=0;i<empId.length;i=i+2) {
			System.out.println(empId[i]);
		
			
		}
		System.out.println("Odd position : ");
		for (int j=1;j<empId.length;j=j+2) {
			System.out.println(empId[j]);
		
			
		}

	}

}
