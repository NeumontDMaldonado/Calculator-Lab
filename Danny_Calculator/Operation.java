package maldonado.Danny_Calculator;

public enum Operation
{
	PLUS("+"),
	MINUS("-"),
	DIVISION("/"),
	MULTIPLICATION("*");
	
	Operation(String s)
	{
		if(s.equals("+") && Calculator.counter==1)
		{
			System.out.println(Calculator.num1 + Calculator.num2);
		}
		else if(s.equals("-") && Calculator.counter==2)
		{
			System.out.println(Calculator.num1 - Calculator.num2);
		}
		else if(s.equals("/") && Calculator.counter==3)
		{
			System.out.println(Calculator.num1/Calculator.num2);
		}
		else if(s.equals("*") && Calculator.counter==4)
		{
			System.out.println(Calculator.num1*Calculator.num2);
		}
	}
}
