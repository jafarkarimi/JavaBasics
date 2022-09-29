package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * write a program to ask a user to enter item they want to buy and the price of that item.
		 * every time user enters money. accumulate the amount and tell the user how much much us left to pay off.
		 * if user give more money program should return a change. whenever user done with payments program should say
		 * "thank you for shopping"
		 */
		
	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome!! What would you like buy? ");
	        String item=scanner.nextLine();
	        System.out.println("The cost of " + item + " is $25");

	        int sum = 25;

	        while(sum!=0) {
	            System.out.println("How much are you gonna pay?");
	            int amount=scanner.nextInt();
	            sum=sum-amount;
	            if(sum>0) {
	                System.out.println("Please pay "+ sum +   " more");

	            } 

	            else if(sum<0) {
	                System.out.println("you change is "+ (sum*-1)+ "$");
	                break;
	            }
	            else if(sum==0) {
	                System.out.println("yes. it is the correct amount");
	            }
	        }

	}

}
