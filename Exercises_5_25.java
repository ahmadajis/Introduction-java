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
public class Exercises_5_25 {
    /*Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a scanner

		// Prompt the user to enter milliseconds
		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();

		// Convert milliseconds to hours, minutes, and seconds
		System.out.println("hours:minuties:seconds: " + convertMillis(millis));
	}

	/* Method convertMillis converts milliseconds to hours, minuties and seconds */
	public static String convertMillis(long millis) {
		// Obtain total seconds
		millis /= 1000;

		// Obtain current minute and second
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		return millis + currentMinuteAndSecond;
	}
}

