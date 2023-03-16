
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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga dos num");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        boolean Salida=false ;
        
        while(Salida==false){
        System.out.println("--- MENU ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divicion");
            System.out.println("5. Salida");
            System.out.println("Elija una opcion:");
        int Opcion;
           Opcion= leer.nextInt();
        switch (Opcion) {
            
            case 1 :
                int suma = (num1 + num2);
                System.out.println("La suma de los dos numero es: " + suma);
                break;
            case 2 :
                int resta = (num1 - num2);
                System.out.println("La reta de los dos numero es: " + resta);
                break;
            case 3 :
                int mult = (num1 * num2);
                System.out.println("La multiplicacion de los dos numero es: " + mult);
                break;
            case 4 :
                int div = (num1 / num2);
                System.out.println("La divicion de los dos numero es: " + div);
                break;
            case 5 :
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String S = leer.next();
                switch (S) {
                    case "S":
                        Salida=true;
                        break;
                    case "N":
                        Salida=false;
                        break;
                        }
                }
        }
        }

    }
    

