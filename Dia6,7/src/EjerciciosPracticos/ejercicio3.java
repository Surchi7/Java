/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
 * estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
 * que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * 
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 * @author nicol
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de los euros a conveertir");
        double euro = leer.nextInt();
        System.out.println("A moneda quiere cambiar?(dolares/libras/yenes) ");
        String moneda = leer.next();
        convertir(euro,moneda);
       
        
    }
    
    public static void convertir(double euro, String moneda){
        Scanner leer = new Scanner(System.in);
        
        double libras = (euro * 0.86)*100/100;
        double dolares = (euro * 1.28611*100/100);
        double yenes = (euro * 129.852*100/100);
        
        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println(dolares);
                break;
            case "libras":
                System.out.println(libras); 
                break;
            case "yenes":
                System.out.println(yenes);
                break;
            default:
                System.out.println("Moneda Invalida");
                break;
        }
       
    }
}
