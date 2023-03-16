/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materialTeorico;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    String retorno = intercambio(frase);
    System.out.print(retorno);
    System.out.println(" ");
}

public static String intercambio(String frase) {
    int largo = frase.length();
    String fraseNueva = "";
    for (int i = 0; i < largo; i++) {
        char letra = frase.charAt(i);
        switch (letra) {
            case 'A':
            case 'a':
                fraseNueva += "@";
                break;
            case 'E':
            case 'e':
                fraseNueva += "#";
                break;
            case 'I':
            case 'i':                
                fraseNueva += "$";
                break;
            case 'O':
            case 'o':    
                fraseNueva += "%";
                break;
            case 'U':
            case 'u':    
                fraseNueva += "*";
                break;
            default:
                fraseNueva += letra;
                break;
        }
    }
    System.out.println("");
    return fraseNueva;
    
}
}


