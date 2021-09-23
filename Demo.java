
package com.hcl;
import java.util.*;
import java.util.Scanner;
public class Demo {
	  public static void main(String[] args) {
	        int billno,date;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the bill no :");
	        billno=sc.nextInt();
	        System.out.println("enter date");
	        date=sc.nextInt();
	        if(billno%100==date) {
	            System.out.println("Lucky Customer");
	        }
	        else
	        {
	            System.out.println("Better lucky next time");
	        }
	            
	    }
}
