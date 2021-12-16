import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your age?: ");
        int age = sc.nextInt();
        if (age > 19) {
            System.out.println("You're too old");
        }
        else if (age<13) {
            System.out.println("Not for kids");
        }
        else {
            System.out.println("Welcome, teenagers");
            }
    }

}


