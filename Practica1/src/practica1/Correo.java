package practica1;
/**
 * Ejercicio 2 CORREGIDO y OPTIMIZADO
 * @author uxio
 */
public class Correo {
    /** DeclaraciÃ³n de variables de la clase*/
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
        usuario=user.toLowerCase();
        servidor=serv.toLowerCase();
    }
    
    /** Construye un objeto Correo a partir de dos parametros de entrada
    * @param apel apellidos
    * @param nom nombre
    */
    public Correo(String apel, String nom)
    {
        apellidos=apel;
        nombre=nom;
        usuario=creausuario(apel,nom).toLowerCase();
        servidor  ="esei.uvigo.es";
        
    }
    
    /** Devuelve una cadena para la formacion del usuario cuando no se 
    * le pasa usuario y servidor
    * @param ap apellidos del usuario
    * @param no nombre del usuario
    * @return cadena formada con el primer apellido y la inicial del nombre
    */
    private String creausuario(String ap, String no){
        /*String apellido1;
        //Metodo 1:
        if (ap.contains(" ")){
            apellido1=ap.subSequence(0, ap.indexOf(" ")).toString();
        }else{
            apellido1=ap;
        }
        return (apellido1+(no.charAt(0)) );
        */
        //Metodo 2:
        //utilizando split:
        String apellido2[] = ap.split(" ");
        return (apellido2[0]+no.charAt(0));
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
    public String toString(){
        return (apellidos+","+nombre+": "+usuario+"@"+servidor);
    }
}
