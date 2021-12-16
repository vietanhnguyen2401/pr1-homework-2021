package Tut2;

public class Activity1 {
    public static void main(String[] args) {
        double weight = 51;
        double height = 1.63;
        double BMI = weight/(Math.pow(height, 2));
        System.out.println("My weight: " +weight+"kg");
        System.out.println("My height: " +height+"m");
        System.out.println("My BMI: " +BMI+"(kg/m2)");
    }
}


