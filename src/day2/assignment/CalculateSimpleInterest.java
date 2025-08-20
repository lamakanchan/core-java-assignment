package day2.assignment;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        //given simple interest = principal * Time * Interest / 100
        //let's assume P = 1500
        // Time = 3 years
        // Interest = 4

        Scanner sc = new Scanner(System.in);
        double P;
        double T;
        double I;

        System.out.println("enter the Principle amount");
         P = sc.nextDouble();
        System.out.println("enter the time");
        T = sc.nextDouble();
        System.out.println("enter the interest");
        I = sc.nextDouble();

        double simpleInterest = (P * T * I ) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);




    }
}
