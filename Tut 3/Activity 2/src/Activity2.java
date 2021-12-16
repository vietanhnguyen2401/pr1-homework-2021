import java.util.Scanner;
public class Activity2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if (year % 4!= 0) {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
        else if (year % 100 != 0) {
            System.out.println("The year " + year + " is a Leap Year.");
        }
        else if (year % 400 != 0) {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
        else {
            System.out.println("The year " + year + " is a Leap Year.");
        }
    }
}
