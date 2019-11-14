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
public class Exercises_5_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Return integer reversed:");

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(reverse(number));
    }

    /**
     * Return an integer in reverse order
     */
    
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }
}
