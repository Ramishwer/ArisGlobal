import java.util.Scanner;
public class ThreeDecimal {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("enter floating-point number: ");
        double a = in.nextDouble();
        System.out.print("enter  second floating-point number: ");
        double b = in.nextDouble();

        a = Math.round(a * 1000);
        a = a / 1000;

        b = Math.round(b * 1000);
        b = b / 1000;

        if (a == b)
        {
            System.out.println("All are same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
