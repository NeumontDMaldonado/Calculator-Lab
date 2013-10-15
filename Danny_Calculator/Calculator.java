package maldonado.Danny_Calculator;

import java.util.Scanner;

public class Calculator 
{
	static double num1;
	static double num2;
	static int counter;
	Calculator()
	{
		calculate();
		operation();
	}
	
	public void calculate()
	{
		System.out.println("Enter first number");
		num1 = newNumber();
		System.out.println("Enter second number");
		num2 = newNumber();	
	}

	private double newNumber() 
	{
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	public void operation()
	{		
		System.out.println("Enter desired operation: +,-,/,*");
		Scanner scan = new Scanner(System.in);
		switch(scan.next())
		{
		case ("+"):
			counter = 1;
			Operation op1 = Operation.PLUS;
			break;
		case ("-"):
			counter = 2;
			Operation op2 = Operation.MINUS;
			break;
		case ("/"):
			counter = 3;
			Operation op3 = Operation.DIVISION;
			break;

		case ("*"):
			counter = 4;
			Operation op4 = Operation.MULTIPLICATION;
			break;
		}
		scan.close();
	}
}