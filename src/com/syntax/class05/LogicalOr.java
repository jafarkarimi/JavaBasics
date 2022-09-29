package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Sunday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax");
		}
		
        double money=120000;
        String title="Automation Tester";
        if (title.equals("Automation Tester") ||money ==120000) {
        	System.out.println("Happy");
        }
        	
	}
}
