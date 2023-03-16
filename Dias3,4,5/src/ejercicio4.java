
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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra");
        String Palabra = leer.next();
       
      String a = "a";
                if (a.equals(Palabra.substring(0,1))){
                    System.out.println("Correto");
                }else { 
                      System.out.println("Incorrecto");  
                }
    }  
}
