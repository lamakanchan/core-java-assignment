package day2.assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //formula to calculate area of circle is PI * radius * radius
        double PI = Math.PI;
        double radius;
        System.out.println("Enter the value of radius");
        radius = sc.nextDouble();
        double areaOfCircle = PI * radius * radius;
        System.out.println("Area of Circle is = " + areaOfCircle);



    }
}
