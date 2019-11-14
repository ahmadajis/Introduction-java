/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author 21129798
 */
public class Exercise_5_24 {

    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMins = totalSeconds / 60;
        long totalHrs = totalMins / 60;
        long totalDays = totalHrs / 24;
        long daysRemaining;
        int currentYear = 1970;
        int currentMonth = 1;
        int totalMonthDays = 0;
        String currentAMorPM = null;

        for (daysRemaining = totalDays; daysRemaining >= 365; daysRemaining
                -= 365) {
            currentYear++;
            if (currentYear % 4 == 0 && currentYear % 100 != 0) {
                daysRemaining--;
            }
        }
        int numOfYears = currentYear - 1970;

        while (daysRemaining >= 0) {
            int monthDays = getNumberOfDaysInMonth(currentYear, currentMonth);
            daysRemaining -= monthDays;

            if (daysRemaining > 0) {
                currentMonth++;
                totalMonthDays += monthDays;
            } else {
                break;
            }
        }
        int currentMonthDay = getNumberOfDaysInMonth(currentYear, currentMonth)+ (int) daysRemaining;

        int currentHour = (int) totalHrs % 24;
        int currentMin = (int) totalMins % 60;
        int currentSec = (int) totalSeconds % 60;
        if (currentHour >= 12 & currentMin > 0) {
            currentAMorPM = "PM";
            currentHour -= 12;
        } else {
            currentAMorPM = "AM";
        }

        System.out.print(getMonthName(currentMonth));
        System.out.print(" " + currentMonthDay + ", " + currentYear + " "
                + currentHour + ":");
        if (currentMin < 10) {
            System.out.print("0" + currentMin + ":");
        } else {
            System.out.print(currentMin + ":");
        }
        if (currentSec < 10) {
            System.out.print("0" + currentSec);
        } else {
            System.out.print(currentSec);
        }
        System.out.print(" " + currentAMorPM);
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0) {
                return 29;
            } else {
                return 28;
            }
        }

        return 0; // If month is incorrect
    }

    static String getMonthName(int month) {
        String monthName = null;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        return monthName ;
    }
}
