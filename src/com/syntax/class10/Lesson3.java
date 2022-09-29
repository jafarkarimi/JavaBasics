package com.syntax.class10;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. when an array is created
		 * retrieve all values from it and while retrieving whose values print capital
		 * for each country. (use 
		 */
		HashMap<String, String> countriesCapitals = new HashMap<String, String>();
        countriesCapitals.put("Afghanistan", "Kabul");
        countriesCapitals.put("Albania", "Tirana");
        countriesCapitals.put("Algeria", "Algiers");
        countriesCapitals.put("Andorra", "Andorra la Vella");
        countriesCapitals.put("Angola", "Luanda");


        System.out.println("Please select two or more countries from the list: (Afghanistan, Albania, Algeria, Andorra, Angola)\n");

        System.out.print("Please add comma separated country names: ");
        Scanner input = new Scanner(System.in);
        String inputData = input.nextLine();

        String[] countries = inputData.split(",");

        for(String item : countries) {
            String country = item.trim();

            if (countriesCapitals.containsKey(country)) {
                System.out.println("Country is " + country + " and the capital is " + countriesCapitals.get(country) + ".\n");
            } else {
                System.out.print("Country " + country + " is not in the list.\n");
            }
        }
    }


	}


