/*
 * Ejercicio 3
 */
package practica1;

/**
 *
 * @author Uxio
 */
public class Personas {
    private String apellidos;
    private String nombre;
    private int dni;
    
    //Contructor
    public Personas (String apel, String nom, int num){
        apellidos = apel;
        nombre = nom;
        dni=num;
    }
    //GETTERS
    public String getApellidos(){
        return apellidos;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDNI(){
        return dni;
    }
    //ToString
    public String ToString(){
        return (dni+CalculaLetra(dni)+ " - " + apellidos + ","+nombre);
    }
    private String CalculaLetra(int numero){
        String Cadena="TRWAGNYFPDXBNJZSQVHLCKE";
        return Character.toString(Cadena.charAt(numero%23));
        //return (Cadena.char(numero%23).toString());
    }
}
