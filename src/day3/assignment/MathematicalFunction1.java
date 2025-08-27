package day3.assignment;

import java.util.Scanner;

public class MathematicalFunction1 {

    //Kinematic equation
    //Formula given: s = u * t + 1/2 * a * t *t
    // u = velocity, t = time, a = acceleration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the velocity");
        double u = sc.nextDouble();

        System.out.println("Enter the time");
        double t = sc.nextDouble();

        System.out.println("Enter the acceleration");
        double a = sc.nextDouble();

        //now to calculate the displacement/kinematic equation we wii use the formula
        //s=ut+1/2 *at*t

        double s = u * t + 1/2 * a * t * t;
        System.out.println("the kinematic equation is " +  s);
    }

}
