
class ReduceFract
{

public static void reduceFraction(int a, int b)
{
	int d;
	d = gcd(a,b);

	a = a / d;
	b = b / d;

	System.out.println("x = " + a + ", y = " + b);
}

public static int gcd(int x, int y)
{
	if (y == 0)
		return x;
	return gcd(y, x % y);
	
}

public static void main(String[] args)
{
	int a = 36;
	int b = 20;

	reduceFraction(a, b);
}
}


