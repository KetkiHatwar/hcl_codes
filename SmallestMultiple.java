package com.hcl;

public class SmallestMultiple {
	public static void main(String[] args){
		SmallestMultiple s=new SmallestMultiple();
		//s.FindLcm();
		s.FindMultiple();
		}// TODO Auto-generated method stub
		public long FindLcm(long a,long b)
		 {
		     long lcm,hcf = 0;
		     long i=1;
		     long greater=a>b?a:b;
		     while(i<greater)
		     {
		         if((a%i==0) && (b%i==0))
		             hcf=i;
		         i++;
		     }
		     lcm=(a*b)/hcf;
		     return lcm;
		 }
		 public void FindMultiple()
		 {
		     long lcm=1;
		     for(long i=2;i<=20;i++)
		     {
		         lcm=FindLcm(lcm,i);
		     }   
		     System.out.println(lcm);
		 }		
		}
	


