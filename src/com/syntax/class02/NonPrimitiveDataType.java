package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
		// String is just one example of non primitive data types 
		
		String name="Asma"; 
		String address="123 address street"; 
		String phone="232  435 45"; 
		int Age=17;   // age always should be in int 
		// anything you can put inside the "" becomes a string 
		String Character="A"; 
		
		// Ctrl=space in result auto completes the statement  
		// syso+ctrl+space+enter   for println 
		System.out.println(name);
		
		// If I want to print my name is Asma What should I do 
		// Ok answer "My name is" + Asma
		System.out.println(" My name is "+name);
		
		// If we want to print that Asma is 17 
		System.out.println( name +" is "+Age); 
		
		String fruit= " apple"; 
		double price= 1.99; 
		
		// How we can print this (the price of the apple is 1.99) 
		
		System.out.println("The price of the"+fruit+" is "+price); 
		
		// now if we see the fruit is mongo 
		
		fruit=" mongo"; 
		price=5.99;
		// now if we want to see that (The price of the mongo is 5.99) 
		System.out.println("The price of the"+fruit+" is "+price); 
		/* to attach any value  (int, double, boolean, char, string) 
		 * to a String we use + 
		 * + next to the String acts as Concatenation 
		 */
		/* Naming Conventions 
		 *  Class should start with Uppercase and follow camel casing 
		 *  Variable should start with Lowercase and follow camel casing 
		 */
		String Wheather="hot"; // not preferred 
		String mywheather="cold"; // preferred 
		
		

	}

}
