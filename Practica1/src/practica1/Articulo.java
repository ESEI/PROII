
/*
 * Ejercicio 6
 */
package practica1;
import java.text.NumberFormat;
/**
 *
 * @author uxio
 */
public class Articulo {
    /** Declaración de variables de la clase*/    
    private String marca;
    private int referencia;
    private int talla;
    private double costeBasico;
    
//Constructor
    /** Construye un objeto Articulo a partir de los parametros de entrada
    * @param xMarca marca del articulo
    * @param xReferencia referencia del artículo
    * @param xTalla talla del articulo
    * @param xCoste Coste básico
    */
    public Articulo (String xMarca, int xReferencia, int xTalla, double xCoste){
        marca = xMarca;
        referencia = xReferencia;
        talla = xTalla;
        costeBasico = xCoste;
    }
    
// GETTERS
    /** @return la marca del articulo */
    public String getMarca(){
        return marca;
    }
    
    /** @return la referencia del articulo */
    public int getReferencia(){
        return referencia;
    }
    
    /** @return la talla del articulo */
    public int getTalla(){
        return talla;
    }
    
    /** @return el coste básico del articulo */
    public double getCosteBasico(){
        return costeBasico;
    }
    
//To String
    /** @return info del objeto como una cadena */
    public String toString(){
        //formateo del importe para que salga con el formato de moneda
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        //formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        return referencia +" - " + marca + "(" + talla + "): coste al por mayor: EUR " + formatoImporte.format(costeBasico+(costeBasico*0.21))  +
        "\n" + referencia +" - " + marca + "(" + talla + "): coste al por menor: EUR " + formatoImporte.format(costeBasico+(costeBasico*0.08));
    }
   
}

