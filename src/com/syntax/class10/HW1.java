package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 */
		int[] num= {10,20,30,40,50 };
		int largestnum=0;
		for(int i=0; i<num.length; i++) {
			if (num[i]>largestnum) {
				largestnum=num[i];
			}
		}
		System.out.println(largestnum);

	}

}
