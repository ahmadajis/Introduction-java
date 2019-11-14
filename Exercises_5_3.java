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
public class Exercises_5_3 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Display and integer reversed:");

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display the reversal of number
        reverse(number);
    }

    /**
     * Reverse Method displays an integer in reverse order
     */
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println();
    }
}
