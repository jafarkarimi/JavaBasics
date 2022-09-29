package com.syntax.class08;

import java.util.Scanner;

public class Recap2 {

	public static void main(String[] args) {
		
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
        for (int b=1; b<=3; b++) {
            System.out.println("What is your name?");
            Scanner scanner=new Scanner(System.in);
            String name=scanner.nextLine();
            System.out.println("Good afretnoon!  "+name);
        }
    }

	}

}
