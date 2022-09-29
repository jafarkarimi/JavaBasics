package com.syntax.class10;

public class Lesson9 {

	public static void main(String[] args) {
		// Create a java program to check whether a given number is prime or not?
	    int num = 9;
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        if(isPrime) {
            System.out.println(num+" is Prime");
        }else {

            System.out.println(num+" is not Prime");
        }

    }

	}


