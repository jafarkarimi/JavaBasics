package com.syntax.class05;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * write a program that will print whether, it is or any 
		 * day from 1-5 output "It us a weekday", anyday 
		 * weekend", any other day out put "invalid day"
		 */
         
		     int day = 7;
		     if (day >=1 && day<=5) {
		    	 System.out.println("This is weekday");
		     } else if (day >= 6 && day <= 7) {
		    	 System.out.println("Its is weekend");
		     } else  {
		    	 System.out.println("Invalid");
		     }
				
	}

}
