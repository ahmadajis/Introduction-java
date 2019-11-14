/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author 21129798
 */
public class Exercises_5_7 {

    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        final int NUMBER_OF_YEARS = 30; // Number of years to display

        // Prompt the user to enter the investment amount and interest rate
        System.out.print("\nEnter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        // Get monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Print a table that displays future value for the years from 1 to 30
        System.out.println("Years     Future Value"); // Table header
        for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n",
                    futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }

    /**
     * Method futureInvestmentValue computes future investement value
     */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

}
