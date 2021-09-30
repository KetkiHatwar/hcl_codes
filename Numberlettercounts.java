package com.hcl;

public class Numberlettercounts {

	public static void main(String[] args) {
		 int n=59;
		 int result=0;		
		 Numberlettercounts o=new Numberlettercounts();
		 result=o.function(n);
		 System.out.println(result);
		}             
		            public static int function(int n) {

		            
		            	int proper[] = {
		  		              0,
		  		              "one".length(),
		  		              "two".length(),
		  		              "three".length(),
		  		              "four".length(),
		  		              "five".length(),
		  		              "six".length(),
		  		              "seven".length(),
		  		              "eight".length(),
		  		              "nine".length(),
		  		              "ten".length(),
		  		              "eleven".length(),
		  		              "twelve".length(),
		  		              "thirteen".length(),
		  		              "fourteen".length(),
		  		              "fifteen".length(),
		  		              "sixteen".length(),
		  		              "seventeen".length(),
		  		              "eighteen".length(),
		  		              "nineteen".length()
		            	};

		  		            // tenth prefixes
		  		            int []tenth = {
		  		              "twenty".length(),
		  		              "thirty".length(),
		  		              "forty".length(),
		  		              "fifty".length(),
		  		              "sixty".length(),
		  		              "seventy".length(),
		  		              "eighty".length(),
		  		              "ninety".length()
		  		            };
		  		          if (n < 20) {
				                return proper[n];
				              }
				              else {
				              return tenth[n / 10 - 2 | 0] + proper[n % 10];}
		            	
		            }
		            

}


