public class Activity2 {
    public static void main(String[] args)
    {
        int a= 3, b= 10, c= 7;
        int max=a;
        if (a<b ) {
            max=b;
            if (b<c) {
                max=c;
            }
        }
        System.out.println("Among " + a +","+ b + " and " + c +","+"the largest is " + max);
    }
}