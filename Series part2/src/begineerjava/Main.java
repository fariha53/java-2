/** 1^1+2^2+3^3+....+n^n*/

package begineerjava;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int n,sum=0;
                System.out.println("Enter the last number =");
                n= input.nextInt();
                for(int i=1; i<=n;i++)
                {
                    System.out.print(i+"x"+i);
                    System.out.print(" ");

                    sum=sum+i*i;
                }

                System.out.println("\nSum ="+sum);
            }
        }


