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
public class fibonacci {

    public void fibonacci(int lim) {
        System.out.println("-- Secuencia de Fibonacci --\n");
        System.out.print("0, 1, ");
        for (int i = 0, a=0, b=1, c=0; i < lim; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
        }
       
        
    }

}
