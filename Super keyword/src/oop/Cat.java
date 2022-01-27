package oop;

public class Cat extends Animal{
    String color = "Black";

    void printColor()
    {
        System.out.println("\nThe color of the cat "+super.color);
    }
}
