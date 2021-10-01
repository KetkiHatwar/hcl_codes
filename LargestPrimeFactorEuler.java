package com.hcl;

public class LargestPrimeFactorEuler {

	public static void main(String[] args) {
	
		long num =600851475143L;
	
		 
		for (int i = 2; i < num; i++) {
		   
		       
		            while(num % i == 0) {
		            	{
		            		num=num/i;		            	}
		    }
		}
		System.out.println(num);
	}

}
