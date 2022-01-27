package oop;

import java.util.Scanner;
public class Main {
    private int sum (int a,int b,int c)
    {
        int result=a+b+c;
        return result;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Main main =new Main();
        int a,b,c,sum;
        System.out.print("Enter of the value of a: ");
        a = input.nextInt();
        System.out.print("Enter of the value of b: ");
        b = input.nextInt();
        System.out.print("Enter of the value of c: ");
        c = input.nextInt();

        sum = main.sum(a,b,c);
        System.out.println("Sum of "+a +" & "+b+" & "+ c+"="+sum);
    }
}
