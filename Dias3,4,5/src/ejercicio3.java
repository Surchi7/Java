
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese una palabra de 8 letras");
        
        String palabra = leer.nextLine(); // Leer palabra
        int S1;
        S1 = palabra.length();
        
        if (S1 == 8 ){
       System.out.println("CORRECTO");   
       } else {
       System.out.println("INCORRECTO");
        }

    }
    
}
