package com.syntax.class07;

public class SwitchCalculator {

	public static void main(String[] args) {
		switch (op) {

        case '+':
            result = (num1 + num2);
            break;
        case '-':
            result = (num1 - num2);
            break;
        case '*':
            result = (num1 num2);
            break;
        case '/':
            result = (num1 / num2);
            break;

        default:

            break;

        }
        if((op=='/')  (op=='*') (op=='+') ||(op=='-')) {
            System.out.println("The Result is: "+result);
        }
        else
        System.out.println("Enter valid operator");
	

	}
}
