package Exceptionques;

import java.util.Scanner;
public class Main {

 public static void main(String args[]) {
//fill your code here
//double result=0.0;
ItemType i=new ItemType(null,null,0.0);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Item type details:");
System.out.println("Enter the name:");
String name=sc.nextLine();
i.setName(name);
// System.out.println("Enter the deposit:");
System.out.println("Enter the deposit:");
String deposit=sc.next();
i.setDeposit(deposit);

try{

double d=Double.parseDouble(deposit);


// if(deposit <0 )throw new NumberFormatException();

System.out.println("Enter the cost per day:");
double costPerDay=sc.nextDouble();
i.setCostPerDay(costPerDay);
System.out.println("Name:"+i.getName());
double d1=Double.parseDouble(deposit);
System.out.println("Deposit:"+d1);
System.out.println("Cost Per Day:"+i.getCostPerDay());

}
catch(NumberFormatException e)
{
System.out.println("java.lang.NumberFormatException: For input string: "+i.getDeposit());

}



}
}