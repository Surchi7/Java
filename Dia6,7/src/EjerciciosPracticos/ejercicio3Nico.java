/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class ejercicio3Nico {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar;
        do {
        System.out.println("Ingrese el monto (€)");
        float monto = leer.nextFloat();
        System.out.println("¿A que moneda desea convertir?");
        String moneda = leer.next();
        convertir(monto,moneda);
        System.out.println("¿Intentar otra conversión? (S/N)");
        continuar = leer.next();
        } while (continuar.equalsIgnoreCase("N") == false);
    }
    
    public static void convertir(float monto, String moneda) {
        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println("€" + monto + " en dolares serían: U$D" + monto * 1.28611 );
                break;
            case "yenes":
                System.out.println("€" + monto + " en yenes serían: ¥" + monto * 129.852 );
                break;
            case "libras":
                System.out.println("€" + monto + " en libras serían: £" + monto * 0.86 );
                break;
            default:
                System.out.println("Tipo de moneda invalida");
                break;
        }
    }
}

