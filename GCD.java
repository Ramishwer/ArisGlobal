import java.util.*;
public class GCD
{
public static void main(String[] args)
{
int a,b,gcd = 0;
System.out.print("enter two no");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
int i;
for(i = 1; i <= a && i <= b; i++)
{
if((a % i == 0) && (b % i == 0))
{
gcd = i;
}
}
System.out.println(gcd);
System.out.println();
}
}

