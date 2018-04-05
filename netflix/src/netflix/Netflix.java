/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import javax.swing.JOptionPane;


/**
 *
 * @author juanvillada7722
 */
public class Netflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String //variables para las categorias
                categoria01,
                categoria02,
                categoria03;

        int //peliculas categoria 01
                categoria01Pelicula01,
                categoria01Pelicula02,
                categoria01Pelicula03,
                categoria01Pelicula04,
                categoria01Pelicula05,
                categoria01Pelicula06,
                categoria01Pelicula07,
                categoria01Pelicula08,
                categoria01Pelicula09,
                categoria01Pelicula10;

        int //peliculas categoria 02
                categoria02Pelicula01,
                categoria02Pelicula02,
                categoria02Pelicula03,
                categoria02Pelicula04,
                categoria02Pelicula05,
                categoria02Pelicula06,
                categoria02Pelicula07,
                categoria02Pelicula08,
                categoria02Pelicula09,
                categoria02Pelicula10;

        int //peliculas categoria 03
                categoria03Pelicula01,
                categoria03Pelicula02,
                categoria03Pelicula03,
                categoria03Pelicula04,
                categoria03Pelicula05,
                categoria03Pelicula06,
                categoria03Pelicula07,
                categoria03Pelicula08,
                categoria03Pelicula09,
                categoria03Pelicula10;

        String //nombres de los clientes
                cliente01,
                cliente02,
                cliente03,
                cliente04,
                cliente05;

        int //favoritismos de los clientes 
                favoritismoPelicula01,
                favoritismoPelicula02,
                favoritismoPelicula03,
                favoritismoPelicula04,
                favoritismoPelicula05,
                favoritismoPelicula06,
                favoritismoPelicula07,
                favoritismoPelicula08,
                favoritismoPelicula09,
                favoritismoPelicula10;
                
        String //generos
                MASCULINO,
                FEMENINO;
        
        int //MAX
                MAX_CATEGORIAS,
                MAX_CATEGORIAS_PELICULA,
                MAX_CLIENTES,
                MAX_PELICULAS;
        
        String //peliculas
                pelicula01,
                pelicula02,
                pelicula03,
                pelicula04,
                pelicula05,
                pelicula06,
                pelicula07,
                pelicula08,
                pelicula09,
                pelicula10;
        
        int //peliculas favoritas por cliente
                peliculaFavorita01Cliente01,
                peliculaFavorita01Cliente02,
                peliculaFavorita01Cliente03,
                peliculaFavorita01Cliente04,
                peliculaFavorita01Cliente05,
                peliculaFavorita02Cliente01,
                peliculaFavorita02Cliente02,
                peliculaFavorita02Cliente03,
                peliculaFavorita02Cliente04,
                peliculaFavorita02Cliente05,
                peliculaFavorita03Cliente01,
                peliculaFavorita03Cliente02,
                peliculaFavorita03Cliente03,
                peliculaFavorita03Cliente04,
                peliculaFavorita03Cliente05;
        
        String //sexo por clientes
                sexoCliente01,
                sexoCliente02,
                sexoCliente03,
                sexoCliente04,
                sexoCliente05;
        
            
                
        System.out.println("hasta ahora solo estan las variables");
       

    }

    //metodo para imprimir
    public static void imprimir(String pregunta) {

        JOptionPane.showMessageDialog(null, pregunta);

    }

    //metodo para leer cadena
    public static String leerCadena(String pregunta) {

        return JOptionPane.showInputDialog(pregunta);

    }

    //metodo para leer entero
    public static int leeEntero(String pregunta) {

        return Integer.parseInt(JOptionPane.showInputDialog(pregunta));
    }

    //metodo para leer caracter
    public static char leerCaracter(String pregunta) {

        return JOptionPane.showInputDialog(null, pregunta).charAt(0);

    }
    
    

}
