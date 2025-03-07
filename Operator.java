package javaproject;

public class Operator {
   
	public static double add(double num1,double num2)
	{
		return num1+num2;
	}
	
	public static double subtract(double num1,double num2)
	{
		return num1-num2;
	}
	
	public static double multiply(double num1,double num2)
	{
		return num1*num2;
	}
	public static double division(double num1,double num2)
	{
		if(num2==0) {
			System.out.println("Error");
		}
		return num1/num2;
	}
}
