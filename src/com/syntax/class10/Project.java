package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter the number of dresses you would like to buy");
		    int size=scan.nextInt();

		    double[] prices=new double[size];

		    for (int i=0; i<size; i++) {
		        System.out.println("Please enter the price of dress no "+(i+1));
		        prices[i]=scan.nextDouble();
		    }
		    System.out.println(Arrays.toString(prices));
		    double sum=0;
		    for (double price:prices) {
		        sum+=price;

		    }
		    System.out.println(sum);
		}
		}

	


