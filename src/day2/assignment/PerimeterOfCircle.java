package day2.assignment;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // formula for perimeter of a circle:2PIr

              System.out.println("Enter the value of radius");
        double radius = sc.nextDouble();
        double PI = Math.PI;
        double perimeterOfCircle = 2 * PI * radius;

        System.out.println("Perimeter of a circle is: " + perimeterOfCircle);
    }
}
