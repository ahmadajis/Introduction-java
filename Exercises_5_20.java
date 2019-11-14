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
public class Exercises_5_20 {

    public static void main(String[] args) {
        System.out.println("\n Degree       Sine        Cosine");
        System.out.println("________________________________");
        int i = 0;
        System.out.print(" " + i + "            ");
        System.out.printf("%-6.4f      ", sine(i));
        System.out.printf("%-6.4f\n", cosine(i));
        for (i = 10; i <= 90; i++) {
            System.out.print(" " + i + "           ");
            System.out.printf("%-6.4f      ", sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i + 9;
        }
        for (i = 100; i <= 180; i++) {
            System.out.print(" " + i + "          ");
            System.out.printf("%-6.4f     ", sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i + 9;
        }
        for (i = 190; i <= 270; i++) {
            System.out.print(" " + i + "         ");
            System.out.printf("%-6.4f     ", sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i + 9;
        }
        for (i = 280; i <= 360; i++) {
            System.out.print(" " + i + "         ");
            System.out.printf("%-6.4f      ", sine(i));
            System.out.printf("%-6.4f\n", cosine(i));
            i = i + 9;
        }
    }

    public static double sine(double i) {
        double sinAngle = Math.sin(i / 180 * Math.PI);
        return sinAngle;
    }

    public static double cosine(double i) {
        double cosAngle = Math.cos(i / 180 * Math.PI);
        return cosAngle;
    }
}
