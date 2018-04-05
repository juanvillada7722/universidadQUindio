/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorabsoluto;

/**
 *
 * @author juanv
 */
public class ValorAbsoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Operacion o = new Operacion();
       
      int absoluto = o.Int(o.leer("Ingrese un numero entero"));       
      String resultado = ""+o.absoluto(absoluto);
      o.mostrar("el absoluto de ese numero es: "+resultado);
        
        
        
    }
    
}
