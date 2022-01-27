
/** 1.5+2.5+3.5+....+n*/
/** 1^1+2^2+3^3+....+n^n*/

package begineerjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
     //   double n,sum=0;
        int n,sum=0;
        System.out.println("Enter the last number =");
        //n= input.nextDouble();
         n= input.nextInt();
        for(int i=1; i<=n;i++)//for(int i=1; i<=n;i+=2)[ ODD NUMBERS SERIES: 1+ 3+5+7+..+n]
                                   //for(int i=2; i<=n;i+=2)[ EVEN  NUMBERS SERIES: 2+ 4+6+8+..+n]
                                   //for(int i=1; i<=n;i++)[NUMBERS SERIES: 1+2+3+4+.....+n]
        {
            System.out.print(i+"  ");
                 //sum+=i;
                 sum=sum+i*i;
        }
        System.out.println("\nSum ="+sum);
    }
}