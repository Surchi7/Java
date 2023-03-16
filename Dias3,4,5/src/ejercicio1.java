
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
       System.out.println("ingrese un numero porfavor");
       int num;
       num = leer.nextInt();
       if (num%2 == 0 ){
       System.out.println("Su numero es par");   
       } else {
       System.out.println("Su numero es impar");    
       }
       
    }
    
}
