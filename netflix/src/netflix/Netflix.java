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
    
    /**
     * Método que permite asignar una categoría a una de las 3 posibles
       variables
     * @param id
     * @param categoria 
     */
   public static void asignarCategoria (int id, String categoria){
       
       
       
   }

   /**
    * Método que permite asignar una de las 2 categorías de cada una de
      las 10 películas
    * @param idPelicula
    * @param numeroCategoria
    * @param idCategoria 
    */
   public static void aisgnarCategoriaPelicula (int idPelicula, int numeroCategoria, int idCategoria){
       
       
       
   }
   
   /**
    * Método que permite asignar un nombre a uno de las 5 posibles
      clientes
    * @param id
    * @param nombre 
    */
   public static void asignarCliente (int id, String nombre){
       
       
       
   }
   
   /**
    * Método que permite asignar un nombre a una de las 10 posibles
      películas
    * @param id
    * @param favoritismo 
    */
   public static void asignarFavoritismoPelicula (int id, int favoritismo){
       
       
       
   }
   
   /**
    * Método que permite asignar un nombre a una de las 10 posibles
      películas
    * @param id
    * @param nombre 
    */
   public static void asignarPelicula (int id, String nombre){
       
       
       
   }
   
   /**
    * Método que permite asignar una de las 3 peliculas favorias por cada
      uno de los clientes
    * @param idCliente
    * @param numeroFvaorita
    * @param idPelicula 
    */
   public static void asignarPeliculaFavoritaCliente (int idCliente, int numeroFvaorita, int idPelicula){
       
       
       
   }
   
   /**
    * Método que permite asignar un sexo a uno de las 5 posibles clientes
    * @param id
    * @param sexo 
    */
   public static void asignarSexoCliente (int id, String sexo){
       
       
       
   } 
   
   /**
    * Método que determinar el favoritismo de cada una de las películas
    */
   public static void contarFavoritismoPeliculas (){
       
       
       
   }
   
   /**
    * Método que cuanta la cantidad de películas por categoría
    * @param idCategoria
    * @return 
    */
   public static int contarPeliculaEnCategoria (int idCategoria){
       
       
       
   }
   
   /**
    * Método que le pregunta al usuario todas las categorías (cantidad
      definida en MAX_CATEGORIAS)
    */
   public static void leerCategorias (){
       
       
       
   }
   
   /**
    * Método que le pregunta al usuario todos los clientes con su sexo
      (cantidad definida en MAX_CLIENTES)
    */
   public static void leerClientes (){
       
       
       
   }
   
   /**
    * Método que le pregunta al usuario su película favorita por categoría
    */
   public static void leerFavoritasUsuario (){
       
       
       
   }
   
   /**
    * Método que le pregunta al usuario todas las películas (cantidad
      definida en MAX_PELICULAS)
    */
   public static void leerPeliculas (){
       
       
       
   }
   
   /**
    * Método que permite llenar con datos de prueba todas la varibles
      haciendo uso de los métodos asignar-----() y de cilos para crear
      datos ficticios
    */
   public static void llenarDatosPrueba (){
       
       
       
   }
   
   /**
    * Método que permite acceder a las 3 variables que almacenan la
      información de las categorías
    * @param id
    * @return 
    */
   public static String obtenerCategoria (int id){
       
       
       
   }
   
   /**
    * Método que permite acceder a las 2 categorías de cada una de las 10
      películas
    * @param idPelicula
    * @param numeroCategoria
    * @return 
    */
   public static int obtenerCategoriaPelicula (int idPelicula, int numeroCategoria){
       
       
       
   }
   
   /**
    * Método que permite acceder a las 5 variables que almacenan el
      nombre de los clientes
    * @param id
    * @return 
    */
   public static String obtenerCliente (int id){
       
       
       
   }
   
   /**
    * Método que permite acceder a las 10 variables que almacenan las
      películas
    * @param id
    * @return 
    */
   public static int obtenerFavoritismoPelicula (int id){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de todas las categorías en forma de
      cadena
    * @return 
    */
   public static String obtenerListadoCategorias (){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de las categorías por película
    * @return 
    */
   public static String obtenerListadoCategoriasPorPeliculas (){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de todos los clientes en forma de cadena
    * @return 
    */
   public static String obtenerListadoClientes (){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de clientes por Sexo
    * @return 
    */
   public static String obtenerListadoClientesPorSexo (){
       
       
       
   }
   
   /**
    * Método que obtiene el listado del favoritismo
    * @return 
    */
   public static String obtenerListadoFavoritismo (){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de pelíulas por categoría
    * @return 
    */
   public static String obtenerListadoPeliculaPorCategorias (){
       
       
       
   }
   
   /**
    * Método que obtiene la lista de todas las películas en forma de
      cadena
    * @return 
    */
   public static String obtenerListadoPeliculas (){
       
       
       
   }
   
   /**
     * Método que permite acceder a las 10 variables que almacenan las
       películas
     * @param id
     * @return 
     */
    public static String obtenerPelicula (int id){
        
        
        
    }
    
    /**
     * Método que obtiene la lista de pelíulas por categoría
     * @param idCategoria
     * @param posicionPelicula
     * @return 
     */
    public static int obtenerPeliculaCategoria (int idCategoria, int posicionPelicula){
        
        
        
    }
    
    /**
     * Método que permite acceder a las 3 peliculas favorias por cada uno
       de los clientes
     * @param idCliente
     * @param numeroFavorita
     * @return 
     */
    public static int obtenerPeliculaFavoritaCliente (int idCliente, int numeroFavorita){
        
        
        
    }
    
    /**
     * Método que obtiene la lista de pelíulas favoritas por usuario
     * @return 
     */
    public static String obtenerPeliculaFavoritasPorUsuario (){
        
        
        
    }
    
    /**
     * Método que permite acceder a las 5 variables que almacenan el sexo
       de los clientes
     * @param id
     * @return 
     */
    public static String obtenerSexoCliente (int id){
        
        
        
    }
    
    /**
     * Método que ordena los nombre de todas las categorías,
       manteniendo cohrente todas las categorías ya asignadas a las
       películas
     */
    public static void ordenarCategorias (){
        
        
        
    }
    
    /**
     * Método que ordena los nombre de todos los clientes, de cambiar el
       orden se ajusta también el sexo asociado
     */
    public static void ordenarClientes (){
        
        
        
    }
    
    /**
     * Método que ordena las películas según su favoritismo, de cambiar el
       orden se ajusta también el favoritismo y las categorías a las que
       pertenece
     */
    public static void ordenarPeliculas (){
        
        
        
    }
}
