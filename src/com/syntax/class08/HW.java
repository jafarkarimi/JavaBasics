package com.syntax.class08;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 *  Declare a variable to store a price for a coffee. Ask the user to pay for a
		 *  coffee. Keep asking to pay for coffee until the user enters the EXACT amount.
		 *  If the user gives more than coffee price __ Ask them to give less, if the
		 *   user gives less money then ask to give more. Once user give EXACT amount 
		 *   print "Please enjoy your coffee"
		 */
		
		Scanner input=new Scanner(System.in);
	    double price=5;
	    double price1;
	    System.out.println("Hello,Welcome to our coffee shop");
	    do
	    {

	        System.out.println("Please pay for your coffee?");
	        price1=input.nextDouble();

	        if(price1>price)
	        {
	            System.out.println("Please pay less");
	        }
	        else if(price1<price)
	        {
	            System.out.println("Please pay more");
	        }
	        else
	        {
	        System.out.println("You have entered the exact amount");
	        System.out.println("!!!!!!!!!!!!!Enjoy your coffeee!!!!!!!!!!!!!");
	        }


	    }while(price1!=5);

	    }
	
		
		

	}

