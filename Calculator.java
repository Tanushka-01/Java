package javaproject;



public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		double num1 = consoleinput.getDouble();
		System.out.println("Enter second number: ");
		double num2 = consoleinput.getDouble();
		System.out.println("Enter Operator Choice: ");

		Menu.optchoice();
        int choice = 0;
		
		while(choice !=5) {
			 choice = consoleinput.getInteger();

		switch (choice) {

		case 1: {
			

			double Output = Operator.add(num1, num2);

			System.out.println("Addition of two numbers is: \n" + Output);
		Menu.optchoice();

			break;

		}
		case 2: 
		{
			double Output = Operator.subtract(num1, num2);
			System.out.println("Subtraction of two numbers is: " + Output);
			
			Menu.optchoice();

			break;
		
		}
		case 3: 
		{
			double Output = Operator.multiply(num1, num2);
			System.out.println("Multiplication of two numbers is: " + Output);
			Menu.optchoice();

			break;
	
		}
		case 4: 
		{
			double Output = Operator.division(num1, num2);
			System.out.println("Division of two numbers is: " + Output);
			Menu.optchoice();

			break;
		}

		default:
			System.out.println("Invalid Choice!");
			break;
		}
		}
	}

}
