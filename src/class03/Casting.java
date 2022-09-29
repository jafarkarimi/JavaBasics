package class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting 
		 * converting one data type to another data type 
		 */
		byte box1=127; // smallest box 8 bytes 
		short box2=3333; // slightly large box
		int box3=454545445; // large box commonly used
		long box4=454545555; // slightly large box
		float box5=454544545;// larger box
		double box6=45445432; // largest
		
		int number=(int)15.2; // we cannot store the decimal number in a box of type double 
		
		byte smallerbox=(byte)box2; 
		System.out.println(smallerbox);
		
		short bigerbox=box1; 
		long box7=box1; // we can do this because box7 is larger than box1 
		
		float box8=(float)box6; // as box6 is larger it is double we need type casting to assign the value 
		
		char a=(char)66;
		System.out.println(a);
		
		int box9=(int)box4; 
		System.out.println(box9);
		
		
		
		
		
		
	}

}
