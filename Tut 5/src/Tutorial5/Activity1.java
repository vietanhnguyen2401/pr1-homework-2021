package Tutorial5;
import java.util.Scanner;
import java.util.Locale;
public class Activity1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String binary= toBinary(number);
        System.out.println(binary);
    }
    public static String toBinary (int number){
        String binary="";
        while(number>0){
            int remainder = number%2;
            binary=remainder+binary;
            number = number/2;
        }
        return binary;
    }
}

