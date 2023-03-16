
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
public class ejercicio5 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de los 
     * numeros introducidos supere el límite inicia
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero limite");
        int numL = leer.nextInt();
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        while(num1 < numL){
            System.out.println("ingrese otro numero");
            int num2 = leer.nextInt();
            num1 = num1 + num2;
        }
        System.out.println("Llegaste al numero limite!");
    }
    
}
