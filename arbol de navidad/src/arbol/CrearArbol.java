/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author juanv
 */
class CrearArbol {

    public String[][] crear() {

        String matriz[][] = new String[16][16];

        for (int i = 0; i < matriz.length; i += 2) {

            for (int j = 0; j < matriz.length - i; j += 2) {

                System.out.print(matriz[j][i] = " ");
            }

            for (int k = 0; k <= i; k++) {

                System.out.print(matriz[k][i] = "*");
            }

            System.out.println(" ");
        }

        return matriz;
    }

}
