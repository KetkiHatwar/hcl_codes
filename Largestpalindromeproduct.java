package com.hcl;

public class Largestpalindromeproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                            
		        int x= 0;
		        for(int i = 100;i < 1000;i++)
		        {
		            for(int j = 100;j < 1000;j++)
		            {
		                int a = i * j;
		                StringBuffer sb1 = new StringBuffer(""+a);
		                String sb2 = ""+a;
		                sb1.reverse();
		                if(sb2.equals(sb1.toString()) && x<a) {
		                    x = a;

		                } 

		            }
		        }
		        System.out.println(x);
 

		    }
	    
  			}




