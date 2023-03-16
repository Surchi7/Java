/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
 * calcular su equivalente: 1 día, 2 horas.
 * @author nicol
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos a convertir");
        int min = leer.nextInt();
        int dia = min / 1440;
        int hor = (min % 1440) / 60;
        System.out.println("Tantos " + min + " minutos son: " + dia + " dia, "+ hor + " horas");
    }
    
}
