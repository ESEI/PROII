/*
 * Ejercicio 1
 */
package practica1;

/**
 *
 * @author uxi
 */
public class Ejercicio1 {
      /** El origen de coordenadas */
    public static final Ejercicio1 ORIGEN = new Ejercicio1( 0, 0 );

    private int x;
    private int y;

    /** Construye un objeto Punto a partir de sus coordenadas
      * @param a la coordenada x
      * @param b la coordenada y
      */
    public Ejercicio1(int a, int b)
    {
        x = a;
        y = b;
    }

    /** @return La coordenada x */
    public int getX()
    {
        return x;
    }

    /** @return La coordenada y */
    public int getY()
    {
        return y;
    }

    /** Calcula la distancia a (0, 0)
      * @return la distancia, como un double
      */
    public double calculaDistanciaOrigen()
    {
        double toret = ( x * x ) + ( y * y );
        return Math.sqrt( toret );
    }

    /** @return info del objeto como una cadena */
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}

