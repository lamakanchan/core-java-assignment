package day3.assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter the Nationality");
        String Nationality = sc.nextLine();

        System.out.println("======Personal Information=====");
        System.out.println("***---***---***---***---***---***");

        System.out.println("name    : " + name);
        System.out.println("age     : " + age);
        System.out.println("Nationality : " + Nationality);

        System.out.println("=================================");

        System.out.println("***---***---***---***---***---***");



    }
}
