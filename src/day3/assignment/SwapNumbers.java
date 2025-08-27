package day3.assignment;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 15; int b = 25;

        System.out.println("Before swapping: ");
        System.out.println("a " + a + ", b = " + b);

        // first, Swap using the temp variable.

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping with temp variable");
        System.out.println("a = " + a + ", b = " + b );

        a = 15;
        b = 25;

        // second, swap without temp variable

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without using temp variable");
        System.out.println("a = " + a + ", b = " + b);
    }
}
