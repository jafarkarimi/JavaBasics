package com.syntax.class10;

public class Fproject2 {

	public static void main(String[] args) {
		//1. Swapping two numbers without using temp variable in Java

	    int a = 10;
	    int b = 20;

	    System.out.println("value of a and b before swapping, a: " + a +" b: " + b);

	    //swapping value of two numbers without using temp variable
	    a = a+ b; //now a is 30 and b is 20
	    b = a -b; //now a is 30 but b is 10 (original value of a)
	    a = a -b; //now a is 20 and b is 10, numbers are swapped

	    System.out.println("value of a and b after swapping, a: " + a +" b: " + b);

	}

}
