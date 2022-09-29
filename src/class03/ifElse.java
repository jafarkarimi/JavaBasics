package class03;

public class ifElse {

	public static void main(String[] args) {
		
		/*
		 * What is type casting?
		 * type casting is converting one data type to another data type
		 * why should i learn about casting?
		 * so that we can use the code that is written by someone else to make our life easier 
		 * or when we will be working in teams we will be able to merge the code
		 * what is syntax for type casting?
		 * when we are converting something smaller to larger we do not need to anything 
		 * it happen automatically we just assign the variable for example
		 * int box=1234
		 * long box2=box; // this is how it works and its called implicit or widening automatic  
		 * however when we convert a larger data type to a smaller data type 
		 * then this is how we do it
		 * long box=123445;
		 * int box2=(int)box; this called narrowing or explicit or manual conversion 
		 */
		double money=5;
		boolean isHungry=true;
		double KfcBurger=15; 
		
		if (money>KfcBurger); {
			System.out.println("Yeahh I can enjoy a Burger");
		} else {
			System.out.println("I should make somthing at home");
			
		}
		
		

	}

}
