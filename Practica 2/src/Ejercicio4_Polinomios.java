/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author uxi
 */
public class Ejercicio4_Polinomios {
      private int[] grado;
      private int[] coeficientes;

    public Ejercicio4_Polinomios(int[] grado, int[] coeficientes){
        this.grado= grado;
        this.coeficientes= coeficientes;
      
     
    }

    /** Construye el polinomio
     * 
     * @return el polinomio, como String
     */
    public String toString(){
         
         //Apartado A: Construccion de la cadena con dos vectores
         
            /**
             * Verificaciones:
             * - Si el coeficiente es cero: no se pone ese grado
             * - Si el coeficiente es 1: no se pone el coeficiente
             * - Si el grado es 1: no se pone x^1, simplemente x
             * - Si el grado es 0: no se pone x^0
             * - Si el grado es cero y el coeficiente es 1: se pone unicamente 1
             * - Si el grado es cero no se pone + al final de la cadena
            */ 
        StringBuilder cadena = new StringBuilder();
        for(int i=0; i<this.grado.length;i++){
            if (this.coeficientes[i]>0){
                if (this.coeficientes[i]>1){
                    cadena.append(this.coeficientes[i]);
                }
                if (this.grado[i]>0){
                    cadena.append("x" + ((this.grado[i]>1)?"^"+this.grado[i]:""));
                }else if (this.coeficientes[i]==1){
                    cadena.append("1");
                } 
            }
            if ((cadena.length()>0) && ((i+1)<this.grado.length) && (this.coeficientes[i+1]>0)){
                cadena.append("+");
            }
        }
        return cadena.toString();
    }
     
    public String toString2(){
         
         //Apartado B: Construccion de la cadena con un vector
         
            /**
             * Verificaciones:
             * - Si el coeficiente es cero: no se pone ese grado
             * - Si el coeficiente es 1: no se pone el coeficiente
             * - Si el grado es 1: no se pone x^1, simplemente x
             * - Si el grado es 0: no se pone x^0
             * - Si el grado es cero y el coeficiente es 1: se pone unicamente 1
             * - Si el grado es cero no se pone + al final de la cadena
            */ 
        StringBuilder cadena = new StringBuilder();
        for(int i=0; i<this.coeficientes.length;i++){
            if (this.coeficientes[i]>0){
                if (this.coeficientes[i]>1){
                    cadena.append(this.coeficientes[i]);
                }
                if (((this.coeficientes.length-i)-1)>0){
                    cadena.append("x" + ((((this.coeficientes.length-i)-1)>1)?"^"+((this.coeficientes.length-i)-1):""));
                }else if (this.coeficientes[i]==1){
                    cadena.append("1");
                } 
            }
            if ((cadena.length()>0) && ((i+1)<((this.coeficientes.length))) && (this.coeficientes[i+1]>0)){
                cadena.append("+");
            }
        }
        return cadena.toString();
    }
}
