
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String eureka = "eureka";
    Scanner leer = new Scanner(System.in);
    String Frase = leer.next();
    Frase =toLowerCase(Frase);
    if ( eureka.equals(Frase)) {
    System.out.println("Coooooorrreeeeectoooooooo");
    }

    }
    
}
