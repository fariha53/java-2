
/** 1.5+2.5+3.5+....+n*/

package begineerjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       double n,sum=0;

        System.out.println("Enter the last number =");
        n= input.nextDouble();

        for(double i=1.5; i<=n;i++)//for(int i=1; i<=n;i+=2)[ ODD NUMBERS SERIES: 1+ 3+5+7+..+n]
                                   //for(int i=2; i<=n;i+=2)[ EVEN  NUMBERS SERIES: 2+ 4+6+8+..+n]
                                   //for(int i=1; i<=n;i++)[NUMBERS SERIES: 1+2+3+4+.....+n]
        {
            System.out.print(i+"  ");
                 sum+=i;

        }
        System.out.println("\nSum ="+sum);
    }
}
