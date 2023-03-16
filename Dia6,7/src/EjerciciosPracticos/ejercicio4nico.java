/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

/**
 *
 * @author nicol
 */
public class ejercicio4nico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
         int num;
        
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
        } while(num <= 0);
        
        if (primo(num) == true) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
        
    }
    public static boolean primo(int num) {
        int c = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
                if (c > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}

   