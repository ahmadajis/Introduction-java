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
public class Exercises_5_1 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

//prompt the user to enter a character
        System.out.print("Enter a character: ");

        char upper = input.next().charAt(0);

//check for validity
        if (!Character.isUpperCase(upper)) {
            System.out.println("Invalid input: Please " + " enter an uppercase letter");

            input.close(); //do nothing and return

            return;

        }

//display result
        System.out.println("Corresponding lowercase: " + uppercaseToLowerCase(upper));

        input.close(); //close the scanner

    }

//Convert upper letter to lower, using ASCII values
    public static char uppercaseToLowerCase(char ch) {
//difference between lower and upper in ASCII
        final int OFFSET = 32;

        return (char) ((int) ch + OFFSET);

    }

}


