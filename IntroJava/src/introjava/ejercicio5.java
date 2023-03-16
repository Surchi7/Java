/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int dob;
        int tri;
        System.out.println("Ingrese su numero porfavor");
        num = leer.nextInt();
        dob = num * 2;
        tri = num * 3;
        System.out.println("el doble de " + num + " es: " + dob);
        System.out.println("el triple de " + num + " es: " + tri);
        System.out.println("la raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
    
}
