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
public class padovan {

    public void padovan(int lim) {
        System.out.println("-- Secuencia de Padovan --\n");
        int a = 1, b = 1, c = 1, d = 0;
        for (int i = 0; i < lim; i++) {
            d = a + b;
            a = b;
            b = c;
            c = d;
            System.out.print(d + ",");
        }
       
    }

}
