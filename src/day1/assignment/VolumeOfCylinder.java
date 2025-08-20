package day1.assignment;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formula for a volume of a cylinder is PI * r * r * h

        System.out.println("enter the value of radius");
        double radius = sc.nextDouble();
        System.out.println("enter the value of height");
        double height = sc.nextDouble();

        double PI = Math.PI;
        double volumeOfCylinder = PI * radius * radius * height;

        System.out.println("Volume of a cylinder is: " + volumeOfCylinder);
    }
}
