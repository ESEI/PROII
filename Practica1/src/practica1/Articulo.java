
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
    private String marca;
    private int referencia;
    private int talla;
    private double costeBasico;
//Constructor
    public Articulo (String xMarca, int xReferencia, int xTalla, double xCoste){
        marca = xMarca;
        referencia = xReferencia;
        talla = xTalla;
        costeBasico = xCoste;
    }
// GETTERS
    public String getMarca(){
        return marca;
    }
    public int getReferencia(){
        return referencia;
    }
    public int getTalla(){
        return talla;
    }
    public double getCosteBasico(){
        return costeBasico;
    }
//To String
    public String ToString(){
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        //formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        return referencia +" - " + marca + "(" + talla + "): coste al por mayor: EUR " + formatoImporte.format(costeBasico+(costeBasico*0.21))  +
        "\n" + referencia +" - " + marca + "(" + talla + "): coste al por menor: EUR " + formatoImporte.format(costeBasico+(costeBasico*0.08));
    }
   
}

