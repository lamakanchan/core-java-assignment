package day4.assignment;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = sc.nextInt();

        System.out.println("Enter Third Number");
        int thirdNumber = sc.nextInt();

        int largest;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            largest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber ) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }
        System.out.println("The largest number is " + largest);

    }
}
