/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorabsoluto;

import javax.swing.JOptionPane;

/**
 *
 * @author juanv
 */
class Operacion {

    public int absoluto(int absoluto) {

        if (absoluto > 0) {

            return absoluto;
        } else {

            absoluto = absoluto * -1;

            return absoluto;

        }

    }

    public String leer(String texto) {

        texto = JOptionPane.showInputDialog(texto);

        return texto;

    }

    public int Int(String texto) {

        int convertido = Integer.parseInt(texto);

        return convertido;

    }

    public void mostrar(String texto) {

        JOptionPane.showMessageDialog(null, texto);

    }

}
