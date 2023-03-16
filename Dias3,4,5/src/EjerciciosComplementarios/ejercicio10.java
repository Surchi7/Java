/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

import java.util.Scanner;

/**
 *Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
 * generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 * @author nicol
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int ale = (int) (Math.random()*10);
       int ale1 = (int) (Math.random()*10);
       int mult = ale * ale1;
       System.out.println("Ingrese un numero entre 0 y 100 hasta adivinar la multiplicacion secreta");
       int num;
       
       do{        
           num= leer.nextInt();
           if (num == mult){
               System.out.println("Adivinasteeeee!!!!");
               break;
           }else {
               System.out.println("Intenta devuelta, tu puedes!");
           }
       } while (num != mult);
    }    
}
