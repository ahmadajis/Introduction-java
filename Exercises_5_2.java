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
public class Exercises_5_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer to sum the digits of: ");
        long value = in.nextLong();
        System.out.println("The sum of all digits is: " + sumDigits(value));
    }

    public static int sumDigits(long n){
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }

        return sum;
        
    }  
    
}
