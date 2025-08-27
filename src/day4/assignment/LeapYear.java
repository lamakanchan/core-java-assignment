package day4.assignment;

import java.util.Scanner;

public class LeapYear {

    //leap year is divisible by 4
    // divisible by 400 but not divisible by 100
    // to find out the leap year, year needs to be divisible by 4 and 400.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }






    }
}
