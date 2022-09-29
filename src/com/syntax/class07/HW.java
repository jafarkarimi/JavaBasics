package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enetr your country");
		String country=input.nextLine();
		String yourLanguage;
		switch (country) {
		case "Moldova":
		    yourLanguage="Romanian";
		    break;
		case "Romania":
		    yourLanguage="Romanian";
		    break;
		case "USA":
		    yourLanguage="English";
		    break;
		case "Kazakhstan":
		    yourLanguage="Kazakh";
		    break;
		case "Germany":
		    yourLanguage="German";
		    break;
		case "Austria":
		    yourLanguage="German";
		    break;
		case "Italy":
		    yourLanguage="Italian";
		    break;
		case "France":
		    yourLanguage="French";
		    break;
		    default:
		        yourLanguage="Unknown";
		}
		System.out.println(yourLanguage);
		

	}

}
