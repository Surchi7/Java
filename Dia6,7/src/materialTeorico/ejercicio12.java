/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materialTeorico;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        Esmultiplo(leer.nextInt(),leer.nextInt());
        
    }
    public static void Esmultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
    }
}

