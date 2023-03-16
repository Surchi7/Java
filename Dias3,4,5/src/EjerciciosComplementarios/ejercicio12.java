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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String centena = Integer.toString(i);
                    String decena = Integer.toString(j);
                    String unidad = Integer.toString(k);

                    if (i == 3) {
                        centena = "E";
                    }
                    if (j == 3) {
                        decena = "E";
                    }
                    if (k == 3) {
                        unidad = "E";
                    }

                    System.out.println(centena + "-" + decena + "-" + unidad);

                }
            }
        }

    }
}


