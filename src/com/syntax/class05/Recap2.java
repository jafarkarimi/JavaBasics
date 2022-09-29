package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		
		boolean allergy=true;
		String allergyType="pollen";
		if (allergy) {
			System.out.println("Let's check what allergy you have");
			if (allergyType.equals("pollen")) {
				System.out.println("Try to stay indoorswhen trees are");
			} else if (allergyType.equals("peanut")) {
				System.out.println("please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			}
		} else {
			System.out.println("You ar lucky");
		}
		

	}

}
