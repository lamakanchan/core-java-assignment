package day2.assignment;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formula: Celsius C = Fahrenheit (F-32) * 5/9

        int a = 32; //32 is constant value

        System.out.println("Enter the value for Fahrenheit");
        double Fahrenheit = sc.nextDouble();
         double Celsius = (Fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Celsius is: " + Celsius);

    }
}
