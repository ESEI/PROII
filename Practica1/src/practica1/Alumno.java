package practica1;

/**
 *
 * @author jgfernandez4
 */
public class Alumno {
    /** DeclaraciÃ³n de variables de la clase*/    
    //public enum Notas {SUSPENSO, APROBADO, NOTABLE, SOBRESALIENTE, MATRICULA};
    public enum Notas {BLOQUE1, BLOQUE2, BLOQUE3, PRACTICAS};
    private int dni;
    private String apellidos;
    private String nombre;
    //private Notas nota;
    private double[] tNota;
    //int tamano=Notas.values().length;
    
   
    
    //Constructor
    /** Construye un objeto Alumno a partir de los parametros de entrada
    * @param xDni DNI del alumno
    * @param xNombre Nombre del alumno
    * @param xApellidos Apellidos del alumno
    */
    public Alumno (int xDni, String xNombre, String xApellidos){
        dni=xDni;
        apellidos = xApellidos;
        nombre = xNombre;
        tNota = new double[Notas.values().length];
    }
    
    /** Construye un objeto Alumno a partir de los parametros de entrada
    * @param xDni DNI del alumno
    * @param xNombre Nombre del alumno
    * @param xApellidos Apellidos del alumno
    */
    /*public Alumno (int xDni, String xNombre, String xApellidos){
        dni = xDni;
        apellidos = xApellidos;
        nombre = xNombre;
    }*/

    //GETTERS
    /** @return el DNI del alumno */
    public int getDni(){
        return dni;
    }
    
    /** @return los apellidos del alumno */
    public String getApellidos(){
        return apellidos;
    }
    
    /** @return el nombre del alumno */
    public String getNombre(){
        return nombre;
    }
    
    /** @return la nota 1 del alummno */
    /*public double getNota(){
        return nota1;
    }*/
    
    //SETTERS
    /** Establece la nota 1 del alumno */
    public void setNota(Notas xtNota,double valor ){
        tNota[xtNota.ordinal()] = valor;
    }
       
    //ToString
    /** @return info del objeto como una cadena */
    public String toString(){
        return "" + dni + CalculaLetra(dni) +"\n";
    }
        //return "" + Integer.toString(dni)  + CalculaLetra(dni) + " - " + apellidos + ", " + nombre + ": " + nota1 +", " + nota2 + ", " + nota3 +", " + practicas;
    
    
    /** Calcula la letra del DNI
     * @param numero el DNI sin letra
     * @return la letra del DNI
     */
    private char CalculaLetra(int numero){
      String Cadena="TRWAGNYFPDXBNJZSQVHLCKE";
      return (Cadena.charAt(numero%23));
    }
    
    /** Crea el informe BOLETIN
     * @return el boletin con los datos del alumno
     */
    /*public String Boletin(){
       String cadena = "-------\n"+
                        "BOLETIN\n" + 
                        "-------\n" +
                dni + CalculaLetra(dni) + " " + apellidos + ", " + nombre +
             "\n------------------------------------------------" + 
             "\nBLOQUE 1 : " + nota1 + " - " + devuelveNota(nota1) + " --------------   FINAL: " + (nota1*0.15) +
             "\nBLOQUE 2 : " + nota2 + " - " + devuelveNota(nota2) + " --------------   FINAL: " + (nota2*0.15) +
             "\nBLOQUE 3 : " + nota3 + " - " + devuelveNota(nota3) + " --------------   FINAL: " + (nota3*0.15) +
             "\nPRACTICAS: " + practicas + " - " + devuelveNota(practicas) + " --------------   FINAL: " + (practicas*0.55)+
             "\n------------------------------------------------" + 
             "\n                         TOTAL : " + ((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " - " + devuelveNota((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " -";
        return cadena;*/
    }
    
     /** devuelve la nota como cadena de texto a partir del numero
      * @param num la nota en numero
      * @return la nota en formato texto
      */
    /*
    public String devuelveNota(double num){
        String texto="";
        if (num <5){
            texto  = "Suspenso     ";
        }else if (num <7){
            texto  ="Aprobado     ";
        }else if (num < 9){
            texto ="Notable      ";
        }else {
            texto ="Sobresaliente";
        }
        return texto;
    }
}*/
