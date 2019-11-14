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
public class Exercise_6_27 {
    public static void main(String args[])
    {
        char[][] pic = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) 
            {
                if ( i == j  ||  i == 0  ||  i == 8 )
                    pic[i][j] = '1';
                else
                    pic[i][j] = '0';
            }
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++)
                System.out.print(pic[i][j]);
            System.out.println();
        }
    }
}
