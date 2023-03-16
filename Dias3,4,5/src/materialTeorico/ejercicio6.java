/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materialTeorico;

import java.util.Scanner;

/**
 *Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25.
 * @author nicol
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga dos num");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25){
            System.out.println("sus numeros son mayores a 25 ");
        }else {
            System.out.println("Sus numeros son menor a 25");
        }
        }
    }
    

