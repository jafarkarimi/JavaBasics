package com.syntax.class09;

public class forEachLoop {

	public static void main(String[] args) {
		
		// only when we deal with arrays or collections
		// we can use for each loop, enhanced for loop, advanced for loop
		String[] iceCream= {"vanilla","chocolate","pishtashio", "kulfi", "mongo"};
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}

	}

}
