package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		System.out.println("please enter your name");
		
		String name=input.next(); // capturing string
		System.out.println("Nice to meet you" +name);
		
		System.out.println("How old are you "+name);
		int age=input.nextInt(); // capturing int 
		System.out.println(name+" is "+age+" years old");
		
		
		System.out.println("End");

	}

}
