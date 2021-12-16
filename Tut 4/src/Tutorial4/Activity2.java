package Tutorial4;
import java.util.Scanner;
import java.util.Locale;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("How many years do you want to deposit your money? ");
        int year=sc.nextInt();
        System.out.println("How much money? ");
        double money=sc.nextDouble();
        System.out.println("What's the interest rate (%)? ");
        double rate=sc.nextDouble();
        for (int i =1;i < year; i++){
            money += money * rate / 100;
        }
        System.out.print("After "+year+" years , you'll receive "+money+".");
    }
}
