package practica1;

/**
 * Ejercicio 7 OPTIMIZADO
 * @author jgfernandez4
 */
public class Alumno {
    /** Declaración de variables de la clase*/    
    //public enum Notas {SUSPENSO, APROBADO, NOTABLE, SOBRESALIENTE, MATRICULA};
    public enum Notas {BLOQUE1, BLOQUE2, BLOQUE3, PRACTICAS};
    private int dni;
    private String apellidos;
    private String nombre;
    private double[] tNota;

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
    
    /** @return la nota del alummno */
    public double getNota(Notas subNota){
        return tNota[subNota.ordinal()];
    }
    
    //SETTERS
    /** Establece la nota del alumno */
    public void setNota(Notas xtNota,double valor ){
        tNota[xtNota.ordinal()] = valor;
    }
       
    //toString
    /** @return info del objeto como una cadena */
    public String toString(){
        return "" + dni + CalculaLetra(dni) + " - " + apellidos + ", " + nombre + ": " + tNota[Notas.BLOQUE1.ordinal()] +", " + tNota[Notas.BLOQUE2.ordinal()] + ", " + tNota[Notas.BLOQUE3.ordinal()] +", " + tNota[Notas.PRACTICAS.ordinal()];
    }
     
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
    public String Boletin(){
       String cadena = "-------\n"+
                        "BOLETIN\n" + 
                        "-------\n" +
                dni + CalculaLetra(dni) + " " + apellidos + ", " + nombre +
             "\n------------------------------------------------" + 
             "\nBLOQUE 1 : " + String.format("%.2f", tNota[Notas.BLOQUE1.ordinal()])  + " - " + devuelveNota(tNota[Notas.BLOQUE1.ordinal()]) + " --------------   FINAL: " + String.format("%.2f", (tNota[Notas.BLOQUE1.ordinal()]*0.15)) +
             "\nBLOQUE 2 : " + String.format("%.2f", tNota[Notas.BLOQUE2.ordinal()]) + " - " + devuelveNota(tNota[Notas.BLOQUE2.ordinal()]) + " --------------   FINAL: " + String.format("%.2f", (tNota[Notas.BLOQUE2.ordinal()]*0.15)) +
             "\nBLOQUE 3 : " + String.format("%.2f", tNota[Notas.BLOQUE3.ordinal()]) + " - " + devuelveNota(tNota[Notas.BLOQUE3.ordinal()]) + " --------------   FINAL: " + String.format("%.2f", (tNota[Notas.BLOQUE3.ordinal()]*0.15)) +
             "\nPRACTICAS: " + String.format("%.2f", tNota[Notas.PRACTICAS.ordinal()]) + " - " + devuelveNota(tNota[Notas.PRACTICAS.ordinal()]) + " --------------   FINAL: " + String.format("%.2f", (tNota[Notas.PRACTICAS.ordinal()]*0.55))+
             "\n------------------------------------------------" + 
             "\n                         TOTAL : " + String.format("%.2f", ((tNota[Notas.BLOQUE1.ordinal()]*0.15)+(tNota[Notas.BLOQUE2.ordinal()]*0.15)+(tNota[Notas.BLOQUE3.ordinal()]*0.15)+(tNota[Notas.PRACTICAS.ordinal()]*0.55))) + " - " + devuelveNota((tNota[Notas.BLOQUE1.ordinal()]*0.15)+(tNota[Notas.BLOQUE2.ordinal()]*0.15)+(tNota[Notas.BLOQUE3.ordinal()]*0.15)+(tNota[Notas.PRACTICAS.ordinal()]*0.55)) + " -";
        return cadena;
    }
    
     /** devuelve la nota como cadena de texto a partir del numero
      * @param num la nota en numero
      * @return la nota en formato texto
      */
    
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
}
