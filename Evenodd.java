public class Evenodd
{
    public static void main(String args[])
    {
        int number = 1235689012;
        int sum1 = 0;
        int sum2 = 0;
        while (number > 0)
        {
            if ((number % 10) % 2 == 0)
                sum1 = sum1 + number % 10;
            else
                sum2 = sum2 + number % 10;
            number = number / 10;
        }
        System.out.print("sum1 : " + sum1 + " sum2 : " + sum2);
    }
}