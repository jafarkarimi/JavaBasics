package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * prompt user the enter height size
		 */
		
		Scanner inp = new Scanner (System.in);
		System.out.println("Please enter your height");
		double height = inp.nextDouble();
		
		if (height<60) {
			System.out.println("short");
		} else if (height>60 && height<72) {
			System.out.println("Medium");
		} else if (height>72) {
			System.out.println("Tall");
		}

	}

}
