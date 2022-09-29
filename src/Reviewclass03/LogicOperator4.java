package Reviewclass03;

import java.util.Scanner;

public class LogicOperator4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with" 
		+ "java logical operator now");
		boolean goodwithOp=scanner.nextBoolean(); 
		
		if(!goodwithOp) {
			System.out.println("Do some more research solve some repls and take some rest");
		}

	}
}
