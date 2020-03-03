package com.Interest.Cost;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class App
{
	private static PrintStream myprint;
	private static Scanner sc;
	public static void getTotalInterest() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("Enter principle  : ");
		double princi=sc.nextDouble();
		myprint.print("Enter time in years : ");
		double time= sc.nextDouble();
		myprint.print("Enter rate of interest per year ");
		double rate=sc.nextDouble();
		Interest i=new Interest(princi,time,rate);
		myprint.print("\n1 - to calculate Simple Interest\n2 - to calculate the Compound Interest\nEnter your  option : ");
		int  op2=sc.nextInt();
		if(op2==1) {
			myprint.print("Total Simple Interest  : "+i.getSimpleInterest());
		}
		else {
			myprint.print("Total Compound Interest : "+i.getCompoundInterest());
		}
	}
	public static void getCostOfBuliding() {
		myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myprint.print("1 - to  standard materials\n2 - to above standard materials\n3 - to high standard material\n4 - to high standard material and fully automated home\nEnter type materials to constuct  buliding : ");
		int op1=sc.nextInt();
		myprint.print("Enter the area of the land  in square feets ");
		double area=sc.nextDouble();
		Building b=new Building(area,op1);
		myprint.print("Cost for construction of buliding with given sqaure feets : "+b.getCost());
	}
    public static void main( String[] args )
    {
	    myprint =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	sc =new Scanner(System.in);
        while(true) {
        	myprint.print("\n1 - to claculate Simple Interest and Compound Interest\n2 - calculate  cost for constructing a buliding\n3 - to exit\n");
        	myprint.print("Enter your option ");
        	int opt = sc.nextInt();
        	switch(opt) {
        	case 1:
        		getTotalInterest();
        		break;
        	case 2:
        		getCostOfBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myprint.print("Enter valid option");
			myprint.close();
	}
}




