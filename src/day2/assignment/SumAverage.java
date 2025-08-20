package day2.assignment;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;

       // System.out.println(sum);
        //calculate sum of two numbers

        System.out.println("enter the first number");
        a = sc.nextFloat();
        System.out.println("enter the second number");
        b = sc.nextFloat();
        float sum =  a + b;
        System.out.println("the sum of " + a + " and " + b + " is: " + sum);

        //calculate average of two numbers
        float average = sum / 2;
        System.out.println("Average is: " + average);
    }
}
