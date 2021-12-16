package Tutorial6.Activity3;
import java.util.Scanner;
public class FactorGenerator {
    private int number ;
    private int nextFactor ;
    public FactorGenerator() {
        number = 0 ;
        nextFactor = 2 ;
    }
    public FactorGenerator (int numberToFactor ){
        number = numberToFactor  ;
        nextFactor =2 ;
    }
    public void setNumber (int numberToFactor ) {
        number = numberToFactor ;
        nextFactor = 2 ;
    }
    public boolean hasMoreFactors (){
        return number != 1 ;
    }
    public int nextFactor (){
        if (number%nextFactor!=0)
            while  (number%nextFactor!=0)nextFactor++ ;
        number = number/nextFactor ;
        return nextFactor ;

    }
    public class FactorPrinter {
        public static void main (String [] args ){
            Scanner key = new Scanner (System.in);
            int number ;
            System.out.println ("Give the number to factor :");
            number = key.nextInt ();
            FactorGenerator toFactor = new FactorGenerator (number);
            while (toFactor.hasMoreFactors ()){
                System.out.println(toFactor.nextFactor());
            }
        }

    }
}
