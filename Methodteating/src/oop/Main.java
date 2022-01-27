package oop;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Operation operation = new Operation();
        int a, b, sum;
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        sum = operation.sum(a, b);//sum = a+b;
        System.out.println("Sum of " + a + " & " + b + " = " + sum);
    }
}
