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
    //Declaracion de variables de la clase
    private String apellidos;
    private String nombre;
    private String usuario;
    private String servidor="esei.uvigo.es";
    
    //Constructor 1:
    public Correo(String apel, String nom, String user, String serv)
    {
        apellidos=apel;
        nombre=nom;
        usuario=user;
        servidor=serv;
    }
    public Correo(String apel, String nom)
    {
        apellidos=apel;
        nombre=nom;
        usuario=creausuario(apel,nom);
        
    }
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
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getServidor(){
        return servidor;
    }
    //SETTERS
    public String ToString(){
        return (apellidos+","+nombre+":"+usuario+"@"+servidor);
    }
}
