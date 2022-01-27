package begineerjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int m,n,sum=0;
        System.out.println("Enter 2 numbers:");
        n = input.nextInt();
        m = input.nextInt();
        for(int i = n;i<=m;i++)
        {
            if(i%2==0){
                sum+=i;
                System.out.println(" "+i);
            }


        }
        System.out.println("The Sum is ="+sum);




    }
}
