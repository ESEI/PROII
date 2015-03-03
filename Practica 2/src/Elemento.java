/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uxi
 * Clase elemento para el ejercicio 4.c
 */
public class Elemento {
    private int coeficiente;
    private int grado;
    
    /** Constructor de la clase Elemento
     * 
     * @param coeficiente el valor del coeficiente, int
     * @param grado el grado del elemento, int
     */
    public  Elemento(int coeficiente, int grado){
        this.coeficiente = coeficiente;
        this.grado = grado;
    }
    
    //GETTERS
    /** Devuelve el coeficiente
     * 
     * @return el valor del coeficiente, como int
     */
    public int getCoeficiente(){
        return this.coeficiente;
    }
    
    /** Devuelve el grado
     * 
     * @return el valor del grado, como int
     */
    public int getGrado(){
        return this.grado;
    }
    
    public String toString(){
        return "Coeficiente: " + this.coeficiente +", grado: " + this.grado;
    }
}
