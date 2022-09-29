package com.syntax.class10;

public class Array2d {

	public static void main(String[] args) {
		// Create a 2D array of integer values. print the sum of all numbers
		int [] [] arr= {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100}
        };


        int sumOfRow1=arr[0][0] + arr[0][1]+ arr[0][2]+ arr[0][3]+ arr[0][4];
        int sumOfRow2=arr[1][0] + arr[1][1]+ arr[1][2]+ arr[1][3]+ arr[1][4];

        System.out.print(sumOfRow1+sumOfRow2);

	}

}
