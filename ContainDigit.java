
class ContainDigit
{
	
	static boolean isDigitPresent(int a, int d)
	{
		
		while (a > 0)
		{
			if (a % 10 == d)
				break;

			a = a / 10;
		}

		
		return (a > 0);
	}

	static void printNumbers(int n, int d)
	{
	
		for (int i = 0; i <= n; i++)

			
			if (i == d || isDigitPresent(i, d))
				System.out.print(i + " ");
	}


	public static void main(String[] args)
	{
		int n = 89, d = 9;
		printNumbers(n, d);
	}
}
