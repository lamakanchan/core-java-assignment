package day3.assignment;

import java.util.Scanner;

public class MathematicalFunction2 {

    //formula given: area = square root of s*(s-a)(s-b)(s-c)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //s= side, a = side b = side c = side

        System.out.println("enter the value of s");
        double s = sc.nextDouble();

        System.out.println("enter the value of side a");
        double a = sc.nextDouble();

        System.out.println("enter the value os side b");
        double b = sc.nextDouble();

        System.out.println("enter the value of side c");
        double c = sc.nextDouble();

        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("The area is " + area);

    }

}
