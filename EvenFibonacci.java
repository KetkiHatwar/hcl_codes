package com.hcl;

public class EvenFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1=1;
		int c2=2;
		int c3;
		int sum=2;
		System.out.print(c1+" "+c2);
		for(int i=2;i<10;++i) {
			c3=c1+c2;
			
			
			System.out.print(" "+c3);
			c1=c2;
			c2=c3;
			if(c3%2==0) {
				sum+=c3;
				//
				}
		}
		System.out.println();
		System.out.print("sum "+sum);

	}

}
