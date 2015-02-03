/*
 * Ejercicio 2
 */
package practica1;

import java.time.Clock;

/**
 *
 * @author uxio
 */
public class Correo {
    /** Declaración de variables de la clase*/
    private String apellidos;
    private String nombre;
    private String usuario;
    private String servidor;
    
    /** Construye un objeto Correo a partir de los parametros de entrada
    * @param apel apellidos
    * @param nom nombre
    * @param user usuario
    * @param serv servidor
    */
    public Correo(String apel, String nom, String user, String serv)
    {
        apellidos=apel;
        nombre=nom;
        usuario=user;
        servidor=serv;
    }
    
    /** Construye un objeto Correo a partir de dos parametros de entrada
    * @param apel apellidos
    * @param nom nombre
    */
    public Correo(String apel, String nom)
    {
        apellidos=apel;
        nombre=nom;
        usuario=creausuario(apel,nom);
        servidor  ="esei.uvigo.es";
        
    }
    
    /** Devuelve una cadena para la formacion del usuario cuando no se 
    * le pasa usuario y servidor
    * @param ap apellidos
    * @param no nombre
    * @return cadena formada con el primer apellido y la inicial del nombre
    */
    private String creausuario(String ap, String no){
        String apellido1="";
        if (ap.contains(" ")){
            apellido1=ap.subSequence(0, ap.indexOf(" ")).toString();
        }else{
            apellido1=ap;
        }
        return (apellido1+no.charAt(0));
    }
    
    //GETTERS
    
    /** @return el nombre */
    public String getNombre(){
        return nombre;
    }
    
    /** @return los apellidos */
    public String getApellidos(){
        return apellidos;
    }
    
    /** @return el usuario */
    public String getUsuario(){
        return usuario;
    }
    
    /** @return el servidor */
    public String getServidor(){
        return servidor;
    }
    
    //SETTERS
    
    /** @return el info del objeto como una cadena */
    public String ToString(){
        return (apellidos+","+nombre+": "+usuario+"@"+servidor);
    }
}
