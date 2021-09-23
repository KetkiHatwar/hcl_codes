package com.hcl;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=10;
		int result=0;
		int result1=0;
		FindMaxMin o=new FindMaxMin();
		result=o.Maximum(x,y);
		result1=o.Minimum(x,y);
		System.out.println("Max "+result);
		System.out.println("Min "+result1);
		System.out.println(Maximum(4,5));
		System.out.println(Minimum(10,15));
			}
		public static int Maximum(int x,int y){
			if(x>y)
			{
				return x;}
			
			else {
				return y;
			}
		}
			public static int Minimum(int x,int y){
				if(x<y)
				{return x;}
				else {
					return y;
				}

			}

}
