package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		// print all numbers from 1 up to 10
		int num=1;
		while(num<=10) {
			System.out.print(num+"  ");
			num++;
		}
		System.out.println("-------------");
		// print all numbers from 10 to 25
		int a=10;
		while(a<=25) {
			a++;
			System.out.print(a+"  ");
		}
		// now print all numbers from 10 up to 1
		
		int b=10;
		while(b>1); {
			System.out.print(b+"  ");
			b--;
		}

	}

}
