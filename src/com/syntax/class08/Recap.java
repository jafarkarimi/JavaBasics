package com.syntax.class08;

public class Recap {

	public static void main(String[] args) {
		
		// print even numbers from 20 to 1 ( two ways)
		int a =20;
		while(a>1) {
		    System.out.print(a+" ");
		    a-=2;
		}
		 
		System.out.println("__");
		int b=20;
		while(b>=1) {
		    if (b%2==0) {
		        System.out.println(b+" ");
		    }
		    b--;
		}

	}

}
