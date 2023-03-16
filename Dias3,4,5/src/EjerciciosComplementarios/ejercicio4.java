/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 * @author nicol
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero del 1 al 10");
        int num = leer.nextInt();              
            switch (num){
                case 1:
                    System.out.println("El numero en romano se escribi: I");
                    break;
                case 2:
                    System.out.println("El numero en romano se escribi: II");
                    break;
                case 3:
                    System.out.println("El numero en romano se escribi: III");
                    break;
                case 4:
                    System.out.println("El numero en romano se escribi: IV");
                    break;
                case 5:
                    System.out.println("El numero en romano se escribi: V");
                    break;
                case 6:
                    System.out.println("El numero en romano se escribi: VI");
                    break;
                case 7:
                    System.out.println("El numero en romano se escribi: VII");
                    break;
                case 8:
                    System.out.println("El numero en romano se escribi: VIII");
                    break;
                case 9:
                    System.out.println("El numero en romano se escribi: IX");
                    break;
                case 10:   
                    System.out.println("El numero en romano se escribi: X");
                    break;
                default:
                    System.out.println("El numero no esta dentro de los parametros");
                    break;
            }                    
        }        
    }
    

