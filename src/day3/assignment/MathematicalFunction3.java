package day3.assignment;

import java.util.Scanner;

public class MathematicalFunction3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();

        //area = x  = - b + square root of b square - 4ac / 2a
        int d = 4;
        int f = 2;

        double x = -b + Math.sqrt( b * b - d * a * c) / f * a;

        System.out.println("the area is " + x);
    }
}
