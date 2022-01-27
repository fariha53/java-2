package begineerjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,res=1;
        System.out.println("Enter the last number =");
        n= input.nextInt();
        for(int i=1; i<=n;i++)//  for(int i=1; i<=n;i+=2)
        {
            System.out.print(i+" ");

            res*=i;
        }
        System.out.println();

        System.out.println(res);
    }
}
