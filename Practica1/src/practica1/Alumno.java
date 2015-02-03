/*
 * Ejercicio 7
 */
package practica1;

/**
 *
 * @author uxi
 */
public class Alumno {
    /** Declaración de variables de la clase*/    
    private int dni;
    private String apellidos;
    private String nombre;
    private double nota1=0;
    private double nota2=0;
    private double nota3=0;
    private double practicas=0;
    
    //Constructor
    /** Construye un objeto Alumno a partir de los parametros de entrada
    * @param xDni DNI del alumno
    * @param xNombre Nombre del alumno
    * @param xApellidos Apellidos del alumno
    * @param xNota1 Nota 1
    * @param xNota2 Nota 2
    * @param xNota3 Nota 3
    * @param xPracticas Nota de practicas
    */
    public Alumno (int xDni, String xNombre, String xApellidos, double xNota1, double xNota2, double xNota3, double xPracticas){
        dni=xDni;
        apellidos = xApellidos;
        nombre = xNombre;
        nota1 = xNota1;
        nota2 = xNota2;
        nota3 = xNota3;
        practicas = xPracticas;
    }
    
    /** Construye un objeto Alumno a partir de los parametros de entrada
    * @param xDni DNI del alumno
    * @param xNombre Nombre del alumno
    * @param xApellidos Apellidos del alumno
    */
    public Alumno (int xDni, String xNombre, String xApellidos){
        dni = xDni;
        apellidos = xApellidos;
        nombre = xNombre;
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
    
    /** @return la nota 1 del alummno */
    public double getNota1(){
        return nota1;
    }
    
    /** @return la nota 2 del alummno */
    public double getNota2(){
        return nota2;
    }
    
    /** @return la nota 3 del alummno */
    public double getNota3(){
        return nota3;
    }
    
    /** @return la nota de practicas del alummno */
    public double getPracticas(){
        return practicas;
    }
    //SETTERS
    /** Establece la nota 1 del alumno */
    public void setNota1(double nota){
        nota1 = nota;
    }
    
    /** Establece la nota 2 del alumno */
    public void setNota2(double nota){
        nota2 = nota;
    }
    
    /** Establece la nota 3 del alumno */
    public void setNota3(double nota){
        nota3 = nota;
    }
    
    /** Establece la nota de practicas del alumno */
    public void setPracticas(double nota){
        practicas = nota;
    }
    //ToString
    /** @return info del objeto como una cadena */
    public String ToString(){
        return "" + dni + CalculaLetra(dni) + " - " + apellidos + ", " + nombre + ": " + nota1 +", " + nota2 + ", " + nota3 +", " + practicas;
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
             "\nBLOQUE 1 : " + nota1 + " - " + devuelveNota(nota1) + " --------------   FINAL: " + (nota1*0.15) +
             "\nBLOQUE 2 : " + nota2 + " - " + devuelveNota(nota2) + " --------------   FINAL: " + (nota2*0.15) +
             "\nBLOQUE 3 : " + nota3 + " - " + devuelveNota(nota3) + " --------------   FINAL: " + (nota3*0.15) +
             "\nPRACTICAS: " + practicas + " - " + devuelveNota(practicas) + " --------------   FINAL: " + (practicas*0.55)+
             "\n------------------------------------------------" + 
             "\n                         TOTAL : " + ((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " - " + devuelveNota((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " -";
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
