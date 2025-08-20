package day2.assignment;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formula for perimeter of a rectangle is 2 (length + width)
        System.out.println("enter the value of length");
        double length = sc.nextDouble();

        System.out.println("enter the value of width");
        double width = sc.nextDouble();

        double perimeterOfRectangle = 2 * (length + width);

        System.out.println("Perimeter of the Rectangle is: " + perimeterOfRectangle);

    }
}
