package Tutorial6.Activity3;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        FactorGenerator generator = new FactorGenerator(number);

        // print out factors

        while(generator.hasMoreFactors()) {
            // if yes
            // get next factor
            int factor = generator.nextFactor();

            // print out
            System.out.println(factor);
        }

    }
}

