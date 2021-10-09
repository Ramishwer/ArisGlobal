import java.util.Scanner;
public class FloatingPoint {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double num = in.nextDouble();

        if (num > 0)
        {
            if (num < 1)
            {
                System.out.println(" small Positive number");
            }
            else if (num > 1000000)
            {
                System.out.println(" large Positive number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (num < 0)
        {
            if (Math.abs(num) < 1)
            {
                System.out.println(" small Negative number");
            }
            else if (Math.abs(num) > 1000000)
            {
                System.out.println(" large Negative number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
