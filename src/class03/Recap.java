package class03;

public class Recap {

	public static void main(String[] args) {
		/*
		 * String concatenation helps us combine a string with any primitive data type together 
		 * 
		 */
		String firstname="Mohammad"; 
		String lastname="Karimi"; 
		String fullname=firstname+lastname;
		System.out.println(fullname);
		
		int houseNo=10;
		int apartmentNo=5; 
		String streetname="the street";
		String City="New York"; 
		String Country="USA";
		String FullAddress=apartmentNo+"  "+houseNo+"   "+streetname+"   "+City+"  "+Country; 
		System.out.println(FullAddress);
		System.out.println("If we substract 10 from 5 we get = " +(10-5));
		

	}

}
