
public class DivisionTest 
{
	public static void main(String[] args)
	{
		Calculator c1= new Calculator();
		c1.divide(10, 20);
		c1.divide(10, 0);
		c1.divide(22, 11);
	}
}

class Calculator
{
	void divide(int num, int deno)
	{
		try 
		{
			float result = num/deno;
			System.out.println("Result after division is:   " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Expection is:   "+e.getMessage());
		}
	}
}

