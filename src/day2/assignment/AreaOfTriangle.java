package day2.assignment;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formula for Area of Triangle is (base * height) /2

        System.out.println("Enter the value of base");
        double base = sc.nextDouble();
        System.out.println("Enter the value of height");
        double height = sc.nextDouble();

       double areaOfTriangle = (base * height) /2;

        System.out.println("Area of Triangle is: " + areaOfTriangle);

    }
}
