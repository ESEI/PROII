/*
 * Ejercicio 5
 */
package practica1;

/**
 *
 * @author uxio
 */
public class Coches {
    private final String[] TIPOCOCHE = {"monovolumen","familiar","compacto","berlina","camioneta"};
    private String marca;
    private String modelo;
    private int nPuertas;
    private int capacidad;
    private int tipo;
    private int cv;
    
    //Constructor
    public Coches (String laMarca, String elModelo, int elnPuertas, int laCapacidad, int elTipo, int elCv){
        marca = laMarca;
        modelo =elModelo;
        nPuertas = elnPuertas;
        capacidad = laCapacidad;
        tipo = elTipo;
        cv = elCv;
    }
    //GETTERS
        public String getMarca(){
            return marca;   
        }
        public String getModelo(){
            return modelo;
        }
        public int getnPuertas(){
            return nPuertas;
        }
        public int getCapacidad(){
            return capacidad;
        }
        public int getTipo(){
            return tipo;
        }
        public int getCv(){
            return cv;
        }
    //ToString
        public String ToString(){
            return marca + " " + modelo + " (" + TIPOCOCHE[(tipo-1)] + ", " + cv + "CV): puertas: " + nPuertas + ", capacidad: " + capacidad;
        }
}
