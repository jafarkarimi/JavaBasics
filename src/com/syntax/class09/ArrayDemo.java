package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// store elements inside an array
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		// accessing elements from the array 
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[2]);
		// Lets create an array and store your classmates
		
		String[] names=new String[5];
		names[0]="shah";
		names[1]="Vera";
		names[2]="Roman";
		names[3]="Guljan";
		names[4]="Mohammad";
		System.out.println("Hello "+names[1]);
				
    
	}
}
