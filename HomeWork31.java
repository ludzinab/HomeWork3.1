package com.itacademy;

import java.util.Scanner;

public class HomeWork31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day: ");
        int day = scanner.nextInt();

        System.out.println("Input month: ");
        int month = scanner.nextInt();

        System.out.println("Input year: ");
        int year = scanner.nextInt();

        System.out.println(isDateValid(day, month, year) ? "Date is valid" : "Date is not valid" );

        int nextDay = (day + 1);
        int nextMonth = (month + 1);
        int nextYear = (year + 1);
        int firstDay = 1;
        int firstMonth = 1;

        if (day < 28) {
            System.out.println("Next day:");
            System.out.println(nextDay);
            System.out.println(month);
            System.out.println(year);
        }

        if (day == 28 & (year % 400 == 0 ||((year % 4 == 0) && (year % 100 != 0)))) {
            System.out.println("Next day:");
            System.out.println(nextDay);
            System.out.println(month);
            System.out.println(year);

        } else if (day == 28 & month == 2){
            System.out.println("Next day:");
            System.out.println(firstDay);
            System.out.println(nextMonth);
            System.out.println(year);
        }

        if ((day == 29 & month == 2 & (year % 400 == 0 ||((year % 4 == 0) && (year % 100 != 0)))) || (day == 30 & (month == 4 || month == 6 || month == 9 || month == 11))) {
            System.out.println("Next day:");
            System.out.println(firstDay);
            System.out.println(nextMonth);
            System.out.println(year);
        }

        if ( day == 29 & (month != 2)) {
            System.out.println("Next day:");
            System.out.println(nextDay);
            System.out.println(month);
            System.out.println(year);
        }

        if ( day == 30 & (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("Next day:");
            System.out.println(nextDay);
            System.out.println(month);
            System.out.println(year);
        }

        if ( day == 31 & ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 )) {
            System.out.println("Next day:");
            System.out.println(firstDay);
            System.out.println(nextMonth);
            System.out.println(year);

        }

        if (day == 31 & month == 12) {
            System.out.println("Next day:");
            System.out.println(firstDay);
            System.out.println(firstMonth);
            System.out.println(nextYear);
        }
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || month <= 0 || year < 0){
            return false;
        }

        boolean valid = true;
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29) {
                    valid = false;
                }
            } else  if (day > 28) {
                valid = false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                valid = false;
            }
        } else {
            if (day > 31) {
                valid = false;
            }
        }

        return valid;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||((year % 4 == 0) && (year % 100 != 0));
    }
}
