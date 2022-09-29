package com.syntax.class10;

import java.util.Scanner;

public class Fproject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        //int numberOfEl = 0;
        int numberOfEl = scanner.nextInt();


        String[] country = new String[numberOfEl];


        String space = scanner.nextLine();
        for (int i = 0; i < country.length; i++) {
            System.out.println("Enter the country name: ");
            System.out.print((i + 1) + ": ");

            country[i] = scanner.nextLine();
            if (country[i].equalsIgnoreCase("Usa")) {
                System.out.println("The capical of " + country[i] + " is Washington");
            }
            if (country[i].equalsIgnoreCase("Egypt")) {
                System.out.println("The capical of " + country[i] + " is Cairo");
            }
            if (country[i].equalsIgnoreCase("China")) {
                System.out.println("The capical of " + country[i] + " is Beijing");
            }
        }

	}

}
