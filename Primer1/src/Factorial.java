public class Factorial
{
	public static void main(String[] args)
	{	System.out.println(factorial(15));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}