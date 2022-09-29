package com.syntax.class10;

public class Taskfromproject {

	public static void main(String[] args) {
		int[][] numbers = { { 2, 5, 70, 86, 53, 9, 65, 4, 12 }, { 10, 8, 2, 4, 68, 17, 16 } };
        int sum = 0;
        int sum1 = 0;
        for (int num[] : numbers) {
            for (int lastnum : num) {

                if (lastnum % 2 == 0) {
                    sum += lastnum;
                }

                if (lastnum % 2 == 1) {
                    sum1 += lastnum;
                }
            }
        }
        System.out.println("THe sum of the even numbers is: " + sum);
        System.out.println("THe sum of the odd numbers is: " + sum1);

	}

}
