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
public class Exercises_5_8 {

    /**
     * Main Method
     */
    public static void main(String[] args) {
        // Display table
        System.out.println( // Display header
                "Celsius     Fahrenheit     |     Fahrenheit     Celsius\n"
                + "----------------------------------------------------------");
        // Display data
        for (double celsius = 40.0, fahrenheit = 120.0;
                celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.printf("%-12.1f", celsius);
            System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
            System.out.printf("     %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
        }
    }

    /**
     * Method Convert from Celsius to Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /**
     *Method  Convert from Fahrenheit to Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}
