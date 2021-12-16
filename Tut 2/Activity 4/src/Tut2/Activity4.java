package Tut2;
import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("A small positive number");
            }
            else if (input > 1000000)
            {
                System.out.println("A large positive number");
            }
            else
            {
                System.out.println("A Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("A small negative number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("A large negative number");
            }
            else
            {
                System.out.println("A negative number");
            }
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}
