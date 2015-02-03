/*
 * Ejercicio 4
 */
package practica1;

/**
 *
 * @author uxio
 */
public class Poligonos {
    /** Declaración de variables de la clase*/    
    private int numLados;
    
    /** Construye un objeto Poligonos a partir de los parametros de entrada
    * @param lados numero de lados
    */
    public Poligonos (int lados){
        numLados=lados;
    }
//GETTERS
    /** @return el numero de lados */
    public int getLados (){
        return numLados;
    }
// ToString
    /** @return info del objeto como una cadena */
    public String ToString(){
        return "Poligono de lados: " +numLados;
    }
    
    /** @return el grado de sus angulos */
    public String angulos(){
        return "Cada ángulo es de " + Integer.toString(360/numLados) + " grados";
    }
}
