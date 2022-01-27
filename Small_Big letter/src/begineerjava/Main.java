package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter character =");
        ch = input.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println("Small letter");
        }
        else if(ch>='A'&& ch<='z')
        {
            System.out.println("Captial letter");
        }
        else if(ch>='0'&& ch<='9')
        {
            System.out.println("Number");
        }

        else {
            System.out.println("Symbol");
        }
    }
}
