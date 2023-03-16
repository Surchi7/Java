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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int C;
        System.out.println("Ingrese los grados centrigrados");
        C = leer.nextInt();
        System.out.println("Los grados centigrados " + C + "°C son en faraday: " + (32 + (9 * C / 5)) + "°F");
    }
    
}
