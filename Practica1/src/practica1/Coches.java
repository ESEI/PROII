/*
 * Ejercicio 5
 */
package practica1;

/**
 *
 * @author uxio
 */
public class Coches {
    /** Declaración de variables de la clase*/    
    private final String[] TIPOCOCHE = {"monovolumen","familiar","compacto","berlina","camioneta"};
    private String marca;
    private String modelo;
    private int nPuertas;
    private int capacidad;
    private int tipo;
    private int cv;
    
    //Constructor
    /** Construye un objeto Coches a partir de los parametros de entrada
    * @param laMarca marca del coche
    * @param elModelo modelo del coche
    * @param elnPuertas numero de puertas del coche
    * @param laCapacidad capacidad del maletero del coche en metros cúbicos
    * @param elTipo tipo del coche
    * @param elCv numero de caballos del coche
    */
    public Coches (String laMarca, String elModelo, int elnPuertas, int laCapacidad, int elTipo, int elCv){
        marca = laMarca;
        modelo =elModelo;
        nPuertas = elnPuertas;
        capacidad = laCapacidad;
        tipo = elTipo;
        cv = elCv;
    }
    //GETTERS
        /** @return la marca del coche */
        public String getMarca(){
            return marca;   
        }
        
        /** @return el modelo del coche */
        public String getModelo(){
            return modelo;
        }
        
        /** @return el número de puertas del coche */
        public int getnPuertas(){
            return nPuertas;
        }
        
        /** @return la capicidad del maletero del coche */
        public int getCapacidad(){
            return capacidad;
        }
        
        /** @return el tipo del coche */
        public int getTipo(){
            return tipo;
        }
        
        /** @return el numero de caballos del coche */
        public int getCv(){
            return cv;
        }
    //ToString
        /** @return info del objeto como una cadena */
        public String ToString(){
            return marca + " " + modelo + " (" + TIPOCOCHE[(tipo-1)] + ", " + cv + "CV): puertas: " + nPuertas + ", capacidad: " + capacidad;
        }
}
