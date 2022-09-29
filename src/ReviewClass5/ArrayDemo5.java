package ReviewClass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number of dresses you want to buy");
        int noOfDresses=scanner.nextInt();

        double[] prices=new double[noOfDresses];

        for(int i=0;i<noOfDresses;i++) {
            System.out.println("Please enter the price of dress no "+(i+1));
            prices[i]=scanner.nextDouble();
        }
        System.out.println(Arrays.toString(prices));
        // Limitations of enhanced for loop
        // we can go only in one direction
        // we can not skip the elements 
        // we can only use it to access the elements in an 
        // we can only use it to access the elements 
        double sum=0;
        for(double price:prices) {
        	
        }
        System.out.println("Total for all the dresses= "+sum);
    }

	}


