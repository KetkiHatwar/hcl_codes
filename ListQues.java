package com.hcl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class ListQues {
	
	public List storeEvenNumber(int N) {
		 List num=new ArrayList<Integer>();
		for(int i=2;i<=N;i++) {
			if(i%2==0) {
				num.add(i);
			}
		}
		return num;
	}
	public ArrayList<Integer> printEventNumber(int a,int b,int c) {
		ArrayList<Integer> num1=new ArrayList<Integer>();
		
			num1.add(a*2);
			num1.add(b*2);
			num1.add(c*2);
		return num1;
	}
	
	public int retriveEvenNumber(List num,int x) {
		List num3=new ArrayList();
		num3.addAll(num);
		if(num.contains(x)) {
			return x;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		ListQues o=new ListQues();
		List numlist=o.storeEvenNumber(50);
				System.out.println(numlist);
				
				ArrayList<Integer> numlist1 =o.printEventNumber(1,2,3);
				System.out.println(numlist1);
				System.out.println(o.retriveEvenNumber(numlist,4));
				
		}
}
