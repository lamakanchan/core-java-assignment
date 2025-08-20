package day2.assignment;

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Formula for Perimeter of a triangle is: a + b + c

        System.out.println("Enter the value a");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c");
        double c = sc.nextDouble();

        double perimeterOfTriangle = a + b + c;
        System.out.println("Perimeter of a Triangle is: " + perimeterOfTriangle);
    }
}
