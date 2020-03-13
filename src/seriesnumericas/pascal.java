/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesnumericas;

/**
 *
 * @author kondor
 */
public class pascal {

    public void pascalInRow(int lim) {
        System.out.println("-- Secuencia de Pascal --\n");
        int rows = lim;
        for (int i = 0; i < rows; i++) {

            int number = 1;

            System.out.print((rows - i) * 2);
            for (int j = 0; j <= i; j++) {
                System.out.print(number);
                number = number * (i - j) / (j + 1);
            }
            System.out.print(",");
        }
    }

    public void pascal(int lim) {
        System.out.println("-- Secuencia de Pascal --\n");
        int rows = lim;
        for (int i = 0; i < rows; i++) {

            int number = 1;

            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
    }

}
