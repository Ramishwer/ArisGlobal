import java.util.Scanner;
public class Avg {
 
public static void main(String[] args)
 
{       
    int i,numbers=0,sum=0;
	double avg;
	{
 
        System.out.println("Enter any 5 numbers : ");  
 
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    numbers = in.nextInt();
 
  		sum +=numbers;
	}
	avg=sum/5;
	System.out.println(" sum is : " +sum+"\nThe Average is : " +avg);
 
}
}