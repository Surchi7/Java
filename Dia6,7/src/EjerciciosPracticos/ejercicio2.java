/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las
 * personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona,
 * el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 * @author nicol
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op;
        do {
            analisis();
            System.out.println("Quieres seguir mostrando personas?No/Si");
            op = leer.next();

        } while (op.equalsIgnoreCase("No") == false);

    }

    public static void analisis() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona y su edad a analizar");
        String nombre = leer.nextLine();
        int edad = leer.nextInt();
        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " No es mayor de edad");
        }

    }

}
