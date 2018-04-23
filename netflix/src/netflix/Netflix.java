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

    public static String //variables para las categorias
            categoria01,
            categoria02,
            categoria03;

    public static String //nombres de los clientes
            cliente01,
            cliente02,
            cliente03,
            cliente04,
            cliente05;

    public static String //peliculas
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

    public static String categoria;

    public static void main(String[] args) {
        asignarCategoria();

        imprimir("las categorias son: "
                + "\n" + "1." + categoria01
                + "\n" + "2." + categoria02
                + "\n" + "3." + categoria03
        );

        asignarPelicula();

        imprimir("las peliculas son: "
                + "\n" + "1." + pelicula01
                + "\n" + "2." + pelicula02
                + "\n" + "3." + pelicula03
                + "\n" + "4." + pelicula04
                + "\n" + "5." + pelicula05
                + "\n" + "6." + pelicula06
                + "\n" + "7." + pelicula07
                + "\n" + "8." + pelicula08
                + "\n" + "9." + pelicula09
                + "\n" + "10." + pelicula10
        );
        asignarCliente();

        imprimir("lOS clientes son: "
                + "\n" + "1." + cliente01
                + "\n" + "2." + cliente02
                + "\n" + "3." + cliente03
                + "\n" + "3." + cliente04
                + "\n" + "3." + cliente05
        );
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

    public static void asignarCategoria() {

        int id;

        for (id = 1; id <= 3; id++) {

            String categoria = leerCadena("Ingrese nombre de la categoria:" + id);

            switch (id) {
                case 1:
                    categoria01 = categoria;
                    break;

                case 2:
                    categoria02 = categoria;
                    break;

                case 3:
                    categoria03 = categoria;
                    break;

            }

        }
    }

    public static void asignarPelicula() {

        int id;

        for (int j = 1; j <= 10; j++) {

            String pelicula = leerCadena("Ingrese nombre de la pelicula:" + j);
            String categorias = leerCadena("Que categoria elije: " + "las categorias son: "
                    + "\n" + "1." + categoria01
                    + "\n" + "2." + categoria02
                    + "\n" + "3." + categoria03
            );

            switch (categorias) {

                case "1":
                    categoria = categoria01;
                    break;

                case "2":
                    categoria = categoria02;
                    break;

                case "3":
                    categoria = categoria03;
                    break;

            }

            switch (j) {
                case 1:
                    pelicula01 = pelicula + " ---> " + categoria;
                    break;

                case 2:
                    pelicula02 = pelicula + " ---> " + categoria;
                    break;

                case 3:
                    pelicula03 = pelicula + " ---> " + categoria;
                    break;

                case 4:
                    pelicula04 = pelicula + " ---> " + categoria;
                    break;

                case 5:
                    pelicula05 = pelicula + " ---> " + categoria;
                    break;

                case 6:
                    pelicula06 = pelicula + " ---> " + categoria;
                    break;

                case 7:
                    pelicula07 = pelicula + " ---> " + categoria;
                    break;

                case 8:
                    pelicula08 = pelicula + " ---> " + categoria;
                    break;

                case 9:
                    pelicula09 = pelicula + " ---> " + categoria;
                    break;

                case 10:
                    pelicula10 = pelicula + " ---> " + categoria;
                    break;

            }

        }

    }

    public static void asignarCliente() {
        int id;

        for (int j = 1; j <= 5; j++) {

            String cliente = leerCadena("Ingrese nombre del  cliente:" + j);

            String sexo = leerCadena("Cual es su sexo? f para femenino y m para masculino ");

            String pelicula = leerCadena("Que pelicula le gusta: " + "las peliculas son: "
                    + "\n" + "1." + pelicula01
                    + "\n" + "2." + pelicula02
                    + "\n" + "3." + pelicula03
                    + "\n" + "4." + pelicula04
                    + "\n" + "5." + pelicula05
                    + "\n" + "6." + pelicula06
                    + "\n" + "7." + pelicula07
                    + "\n" + "8." + pelicula08
                    + "\n" + "9." + pelicula09
                    + "\n" + "10." + pelicula10
            );

            switch (sexo) {
                case "m":
                    sexo = "masculino";
                    break;
                case "f":
                    sexo = "femenino";
                    break;

            }

            switch (pelicula) {

                case "1":
                    pelicula = pelicula01 + " " + categoria;
                    break;

                case "2":
                    pelicula = pelicula02 + " " + categoria;
                    break;

                case "3":
                    pelicula = pelicula03 + " " + categoria;
                    break;

                case "4":
                    pelicula = pelicula04 + " " + categoria;
                    break;

                case "5":
                    pelicula = pelicula05 + " " + categoria;
                    break;

                case "6":
                    pelicula = pelicula06 + " " + categoria;
                    break;

                case "7":
                    pelicula = pelicula07 + " " + categoria;
                    break;

                case "8":
                    pelicula = pelicula08 + " " + categoria;
                    break;

                case "9":
                    pelicula = pelicula09 + " " + categoria;
                    break;

                case "10":
                    pelicula = pelicula10 + " " + categoria;
                    break;

            }

            switch (j) {
                case 1:
                    cliente01 = cliente + " ---> " + pelicula + " " + sexo;
                    break;

                case 2:
                    cliente02 = cliente + " ---> " + pelicula + " " + sexo;
                    break;

                case 3:
                    cliente03 = cliente + " ---> " + pelicula + " " + sexo;
                    break;

                case 4:
                    cliente04 = cliente + " ---> " + pelicula + " " + sexo;
                    break;

                case 5:
                    cliente05 = cliente + " ---> " + pelicula + " " + sexo;
                    break;

            }

        }
    }

}
