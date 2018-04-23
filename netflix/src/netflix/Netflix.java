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

    public static int //peliculas categoria 01
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

    public static int //peliculas categoria 02
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

    public static int //peliculas categoria 03
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

    public static String //nombres de los clientes
            cliente01,
            cliente02,
            cliente03,
            cliente04,
            cliente05;

    public static int //favoritismos de los clientes 
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

    public static String //generos
            MASCULINO,
            FEMENINO;

    public static int //MAX
            MAX_CATEGORIAS,
            MAX_CATEGORIAS_PELICULA,
            MAX_CLIENTES,
            MAX_PELICULAS;

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

    public static int //peliculas favoritas por cliente
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

    public static String //sexo por clientes
            sexoCliente01,
            sexoCliente02,
            sexoCliente03,
            sexoCliente04,
            sexoCliente05;

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

    /**
     * Método que permite asignar una categoría a una de las 3 posibles
     * variables
     *
     * @param id
     * @param categoria
     */
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

    /**
     * Método que permite asignar una de las 2 categorías de cada una de las 10
     * películas
     *
     * @param idPelicula
     * @param numeroCategoria
     * @param idCategoria
     */
    public static void asignarCategoriaPelicula() {

    }

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 10; j++) {
//
//            }
//        }
    /**
     * Método que permite asignar un nombre a uno de las 5 posibles clientes
     *
     * @param id
     * @param nombre
     */
    public static void asignarCliente(int id, String nombre) {

    }

    /**
     * Método que permite asignar un nombre a una de las 10 posibles películas
     *
     * @param id
     * @param favoritismo
     */
    public static void asignarFavoritismoPelicula(int id, int favoritismo) {

    }

    /**
     * Método que permite asignar un nombre a una de las 10 posibles películas
     *
     * @param id
     * @param nombre
     */
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

    /**
     * Método que permite asignar una de las 3 peliculas favorias por cada uno
     * de los clientes
     *
     * @param idCliente
     * @param numeroFvaorita
     * @param idPelicula
     */
    public static void asignarPeliculaFavoritaCliente(int idCliente, int numeroFvaorita, int idPelicula) {

    }

    /**
     * Método que permite asignar un sexo a uno de las 5 posibles clientes
     *
     * @param id
     * @param sexo
     */
    public static void asignarSexoCliente(int id, String sexo) {

    }

    /**
     * Método que determinar el favoritismo de cada una de las películas
     */
    public static void contarFavoritismoPeliculas() {

    }

    /**
     * Método que cuanta la cantidad de películas por categoría
     *
     * @param idCategoria
     * @return
     */
    public static int contarPeliculaEnCategoria(int idCategoria) {

        return 0;

    }

    /**
     * Método que le pregunta al usuario todas las categorías (cantidad definida
     * en MAX_CATEGORIAS)
     */
    public static void leerCategorias() {

    }

    /**
     * Método que le pregunta al usuario todos los clientes con su sexo
     * (cantidad definida en MAX_CLIENTES)
     */
    public static void leerClientes() {

    }

    /**
     * Método que le pregunta al usuario su película favorita por categoría
     */
    public static void leerFavoritasUsuario() {

    }

    /**
     * Método que le pregunta al usuario todas las películas (cantidad definida
     * en MAX_PELICULAS)
     */
    public static void leerPeliculas() {

    }

    /**
     * Método que permite llenar con datos de prueba todas la varibles haciendo
     * uso de los métodos asignar-----() y de cilos para crear datos ficticios
     */
    public static void llenarDatosPrueba() {

    }

    /**
     * Método que permite acceder a las 3 variables que almacenan la información
     * de las categorías
     *
     * @param id
     * @return
     */
    public static String obtenerCategoria(int id) {

        return "";

    }

    /**
     * Método que permite acceder a las 2 categorías de cada una de las 10
     * películas
     *
     * @param idPelicula
     * @param numeroCategoria
     * @return
     */
    public static int obtenerCategoriaPelicula(int idPelicula, int numeroCategoria) {

        return 0;

    }

    /**
     * Método que permite acceder a las 5 variables que almacenan el nombre de
     * los clientes
     *
     * @param id
     * @return
     */
    public static String obtenerCliente(int id) {

        return "";

    }

    /**
     * Método que permite acceder a las 10 variables que almacenan las películas
     *
     * @param id
     * @return
     */
    public static int obtenerFavoritismoPelicula(int id) {

        return 0;

    }

    /**
     * Método que obtiene la lista de todas las categorías en forma de cadena
     *
     * @return
     */
    public static String obtenerListadoCategorias() {

        return "";

    }

    /**
     * Método que obtiene la lista de las categorías por película
     *
     * @return
     */
    public static String obtenerListadoCategoriasPorPeliculas() {

        return "";
    }

    /**
     * Método que obtiene la lista de todos los clientes en forma de cadena
     *
     * @return
     */
    public static String obtenerListadoClientes() {

        return "";
    }

    /**
     * Método que obtiene la lista de clientes por Sexo
     *
     * @return
     */
    public static String obtenerListadoClientesPorSexo() {

        return "";

    }

    /**
     * Método que obtiene el listado del favoritismo
     *
     * @return
     */
    public static String obtenerListadoFavoritismo() {

        return "";
    }

    /**
     * Método que obtiene la lista de pelíulas por categoría
     *
     * @return
     */
    public static String obtenerListadoPeliculaPorCategorias() {

        return "";

    }

    /**
     * Método que obtiene la lista de todas las películas en forma de cadena
     *
     * @return
     */
    public static String obtenerListadoPeliculas() {

        return "";

    }

    /**
     * Método que permite acceder a las 10 variables que almacenan las películas
     *
     * @param id
     * @return
     */
    public static String obtenerPelicula(int id) {

        return "";

    }

    /**
     * Método que obtiene la lista de pelíulas por categoría
     *
     * @param idCategoria
     * @param posicionPelicula
     * @return
     */
    public static int obtenerPeliculaCategoria(int idCategoria, int posicionPelicula) {

        return 0;
    }

    /**
     * Método que permite acceder a las 3 peliculas favorias por cada uno de los
     * clientes
     *
     * @param idCliente
     * @param numeroFavorita
     * @return
     */
    public static int obtenerPeliculaFavoritaCliente(int idCliente, int numeroFavorita) {

        return 0;

    }

    /**
     * Método que obtiene la lista de pelíulas favoritas por usuario
     *
     * @return
     */
    public static String obtenerPeliculaFavoritasPorUsuario() {

        return "";

    }

    /**
     * Método que permite acceder a las 5 variables que almacenan el sexo de los
     * clientes
     *
     * @param id
     * @return
     */
    public static String obtenerSexoCliente(int id) {

        return "";

    }

    /**
     * Método que ordena los nombre de todas las categorías, manteniendo
     * cohrente todas las categorías ya asignadas a las películas
     */
    public static void ordenarCategorias() {

    }

    /**
     * Método que ordena los nombre de todos los clientes, de cambiar el orden
     * se ajusta también el sexo asociado
     */
    public static void ordenarClientes() {

    }

    /**
     * Método que ordena las películas según su favoritismo, de cambiar el orden
     * se ajusta también el favoritismo y las categorías a las que pertenece
     */
    public static void ordenarPeliculas() {

    }
}
