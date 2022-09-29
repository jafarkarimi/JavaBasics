package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		
		String[][] countries= {
                {"USA","Canada"},// 1 array with index 0
                {"Peru","Brazil","Columbia","Ecuador"},// 2 array with index 1
                {"Ethiopia","Egypt","Kenya"},
                {"Germany","Turkiye","Moldova","Ukraine"},
                {"Kazhakhstan","Afghanistan","Korea"},
        };
        System.out.println(countries.length);// row 5 total number of array or rows
        int elementsOf1arr=countries[0].length;
        System.out.println(elementsOf1arr);
        int elementsOf2arr=countries[1].length;
        System.out.println(elementsOf1arr);

        System.out.println("== =======all values from 2d array============");
        for(int r =0; r<countries.length; r++) { // loops over rows
            for(int c=0; c<countries[r].length; c++) {
                System.out.print(countries[r][c]+" ");
            }
            System.out.println();
        }
    }
	}


