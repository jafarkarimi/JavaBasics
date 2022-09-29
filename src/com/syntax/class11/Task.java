package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		 Phones phone = new Phones();
	        phone.make = "Apple";
	        phone.model = "Iphone 13 Pro Max";
	        phone.makeYear = 2021;
	        phone.color = "Black";
	        phone.size = 6.5;
	        phone.storage = 256;
	        phone.cameraMp = 22;
	        phone.inventionYear = 2007;


	        phone.call("703 454 6567");
	        phone.isTakingPhoto();
	        phone.isTakingVideo();
	        phone.phomeInventor("Steve Jobs", "google","Lee Byung-Chull");
	        System.out.println("-----------------");

	        Phones phone1 = new Phones();
	        phone1.make = "Samsung";
	        phone1.model = "S22 Ultra";
	        phone1.makeYear = 2022;
	        phone1.color = "Silver";
	        phone1.size = 6.7;
	        phone1.storage = 64;
	        phone1.cameraMp = 12;
	        phone1.inventionYear = 2009;

	        phone1.call("Oscar");
	        phone1.isTakingPhoto();
	        phone1.isTakingVideo();
	        phone1.phomeInventor("Steve Jobs", "google","Kim Hyun Suk");

	        System.out.println("-----------------");

	        Phones phone2 = new Phones();
	        phone2.make = "pixel";
	        phone2.model = "Pixel 6 pro";
	        phone2.makeYear = 2022;
	        phone2.color = "black";
	        phone2.size = 5.5;
	        phone2.storage = 512;
	        phone2.cameraMp = 26;
	        phone2.inventionYear = 2019;

	        phone2.call("672 556 45654");
	        phone2.isTakingPhoto();
	        phone2.isTakingVideo();
	        phone2.phomeInventor("Steve Jobs", "google","Kim Hyun Suk");

	}

}
