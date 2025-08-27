package day4.assignment;

import java.util.Scanner;

public class PrintNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();


        if (number < 0){
            System.out.println("The number you have entered is negative: " + number);
        } else {
            System.out.println("The number is positive.Nothing to Display");
        }
    }
}
