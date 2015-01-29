/*
 * Ejercicio 4
 */
package practica1;

/**
 *
 * @author uxio
 */
public class Poligonos {
    
    private int numLados;
    
//Constructor
    public Poligonos (int lados){
        numLados=lados;
    }
//GETTERS
    public int getLados (){
        return numLados;
    }
// ToString
    public String ToString(){
        return "Poligono de lados: " +numLados;
    }
    public String angulos(){
        return "Cada ángulo es de " + Integer.toString(360/numLados) + " grados";
    }
}
