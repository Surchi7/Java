/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

/**
 *
 * @author nicol
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A = 5;
       int B = 10;
       int C = 15;
       int D = 20;
       int aux;
       
       System.out.println("Al principio nos los valores son A= " + A + " B= " + B + " C= " + C + " D= " + D);
       
       aux = B;
       B = C;
       C = A;
       A = D;
       D = aux;
       
       System.out.println("Ahora los valores son A= " + A + " B= " + B + " C= " + C + " D= " + D);           
    }    
}
