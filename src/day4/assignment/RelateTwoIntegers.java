package day4.assignment;

import java.util.Scanner;

public class RelateTwoIntegers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number.");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number.");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("num1 is: " + " = " + num2);
        } else if (num1 > num2) {
            System.out.println("num1 is: " + " > " + num2);

        } else {
            System.out.println("num1 is: " + " < " + num2);
        }

    }
}
