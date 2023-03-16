/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1 = -1, n2 = -1;
        
        while (n1 < 0 || n2 < 0) {
            System.out.println("Ingrese dos números positivos");
            n1 = leer.nextInt();
            n2 = leer.nextInt();
        }
        int i = 0, op, suma, resta, mult;
        float div;
        boolean exit = false;

        while (exit == false) {
            System.out.println("====Menu==== \nElija la opción \n(1) Sumar \n(2) Restar \n(3) Multiplicar \n(4) Dividir \n(5) Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    suma = suma(n1,n2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = resta(n1,n2);
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    mult = mult(n1,n2);
                    System.out.println("La multiplicacion es: " + mult);
                    break;
                case 4:
                    div = div(n1,n2);
                    System.out.println("La división es: " + div);
                    break;
                case 5:
                    System.out.println("¿Desea salir? (S/N)");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("s") == true) {
                        exit = true;
                    }
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
        }
    }
    
    public static int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }
    public static int resta(int n1, int n2) {
        int resta = n1 - n2;
        return resta;
    }
    public static int mult(int n1, int n2) {
        int mult = n1 * n2;
        return mult;      
    }
    public static float div(int n1, int n2) {
        float div = (float) n1 / n2;
        return div;
    }
}
    


