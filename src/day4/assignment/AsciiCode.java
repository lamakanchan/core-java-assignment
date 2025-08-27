package day4.assignment;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ASCII Code from (0-128)");
        int AsciiCode = sc.nextInt();

        if (AsciiCode >=0 && AsciiCode <=128) {
            char character = (char) AsciiCode;
            System.out.println("The character for AsciiCode " + AsciiCode + " is " + character);
        } else {
            System.out.println("You have entered an invalid number. Please enter number between 0-128");
        }
    }
}
