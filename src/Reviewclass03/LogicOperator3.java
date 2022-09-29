package Reviewclass03;

public class LogicOperator3 {

	public static void main(String[] args) {
		
		double saving=200000;
		boolean freeTime=true;
		String season="summer";  
		
		if (saving>100000 &&freeTime&& season.equals("summer")) {
			System.out.println("Let's go to vacation");
		} else {
			System.out.println("I need time and money");
		}
		

	}

}
