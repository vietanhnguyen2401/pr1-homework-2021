public class Activity3 {
    public static void main (String[] args) {
        int have=483274;
        int quan=have/10000;
        int dong=(have%10000)/100;
        int hao=((have%10000)%100)/10;
        int xu=have/1000;
        System.out.println(quan+" quan"+", "+dong+" dong"+", "+hao+" hao"+", "+xu+" xu");
    }
}
