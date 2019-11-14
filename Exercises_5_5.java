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
public class Exercises_5_5 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner

		// Prompt the user to enter three numbers
		System.out.print("Enter three numbers1: ");
		double number1 = input.nextDouble();
                                    System.out.print("Enter three numbers2: ");
		double number2 = input.nextDouble();
                                    System.out.print("Enter three numbers3: ");
		double number3 = input.nextDouble();

		// Display numbers in increasing order
		Sort(number1, number2, number3);
	}

	/** displaySortedNumbers Method displays three numbers in increasing order */
	public static void Sort(double num1, double num2, double num3) {
		double temp; // Hold number to swap
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		// Display result
		System.out.println( "Sorting Number Is: " + num1 + " " + num2 + " " + num3);
	}
}
