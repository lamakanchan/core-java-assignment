package day2.assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //formula: area of rectangle = length * breadth
        System.out.println("Enter the length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth = sc.nextDouble();
        double areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle is: " + areaOfRectangle);
    }
}
