package Reviewclass03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean programmer=true;
		boolean manualTester=true;
		
		
		if (programmer&&manualTester) {
			System.out.println("You can be an automation engineer");
		}
		else 
		{
			System.out.println("you must know a programming language and manual testing" 
		+ "to be an automation engineer");
		}

	}
}
