package oop;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("\nValue of a = "+a);
        double b = random.nextDouble();
        System.out.println("Value of b = "+b);
    }
}
