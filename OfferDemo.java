package com.hcl;
import java.util.*;
import java.util.Scanner;

public class OfferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1,c2,c3;
		 Scanner sc=new Scanner(System.in);
	        System.out.println("c1");
	       c1=sc.nextInt();
	        System.out.println("c2");
	        c2=sc.nextInt();
	        System.out.println("c3");
	        c3=sc.nextInt();
	        int sum=c1+c2+c3;
	        double o1;
	        o1=sum-(sum*0.2);
	        System.out.println("o1 = "+o1);
	        double o2;
	        double smallest;
	        if (c1 <= c2 && c1 <= c3) {
	            smallest = c1;
	        } else if (c2 <= c3 && c2 <= c1) {
	            smallest = c2;
	        } else {
	            smallest = c3;
	        }
	        o2=c1+c2+c3-smallest;
	        System.out.println("o2 = "+o2);
	        if (o1<o2) {
	        	System.out.println("offer 1 is better");
	        	
	        }
	        else {
	        	System.out.println("offer 2 is better");
	        }
		
		
	}

}
