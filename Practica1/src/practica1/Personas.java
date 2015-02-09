/*
 * Ejercicio 3
 */
package practica1;

/**
 *
 * @author Uxio
 */
public class Personas {
    /** Declaración de variables de la clase*/
    private String apellidos;
    private String nombre;
    private int dni;
    
    /** Construye un objeto Personas a partir de los parametros de entrada
    * @param apel apellidos
    * @param nom nombre
    * @param num DNI
    */
    public Personas (String apel, String nom, int num){
        apellidos = apel;
        nombre = nom;
        dni=num;
    }
    
    //GETTERS
    /** @return el apellido */
    public String getApellidos(){
        return apellidos;
    }
    
    /** @return el nombre */
    public String getNombre(){
        return nombre;
    }
    
    /** @return el DNI */
    public int getDNI(){
        return dni;
    }
    //ToString
    /** @return info del objeto como una cadena */
    public String toString(){
        return (""+ dni+CalculaLetra(dni)+ " - " + apellidos + ","+nombre);
    }
    
    /** Calcula la letra del DNI
    * @param numero DNI sin letra
    * @return la letra del DNI
    */
    private char CalculaLetra(int numero){
        String Cadena="TRWAGNYFPDXBNJZSQVHLCKE";
        return (Cadena.charAt(numero%23));
        //para devolver una cadena:
        //return Character.toString(Cadena.charAt(numero%23));
    }
}
