package day2.assignment;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //formula: Fahrenheit = (Celsius * 9/5) + 32;

        int a = 32; // a is a constant value

        System.out.println("Enter the value of Celsius");
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);

    }
}
