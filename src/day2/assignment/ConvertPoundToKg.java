package day2.assignment;

import java.util.Scanner;

public class ConvertPoundToKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 pound = 0.454kg

        double a = 0.454;

        System.out.println("Enter the number of pound");
        double pound = sc.nextDouble();

        double Kg = pound * a;

        System.out.println("kg " + Kg);
    }
}
