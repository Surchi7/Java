/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
 * Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
 * matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan
 * los números o resultados.
 * @author nicol
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a analisar");
        int num = leer.nextInt();
        int cont = 0;
        while (num >= 1){
            num = num / 10;
            cont++;
        }
        if (cont > 1){
            System.out.println("El numero posee " + cont + " dijitos");
        }
        
    }
    
}
