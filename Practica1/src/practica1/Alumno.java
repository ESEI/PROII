/*
 * Ejercicio 7
 */
package practica1;

import java.text.NumberFormat;

/**
 *
 * @author uxi
 */
public class Alumno {
    private int dni;
    private String apellidos;
    private String nombre;
    private double nota1=0;
    private double nota2=0;
    private double nota3=0;
    private double practicas=0;
    
    //Constructor
    public Alumno (int xDni, String xNombre, String xApellidos, double xNota1, double xNota2, double xNota3, double xPracticas){
        dni=xDni;
        apellidos = xApellidos;
        nombre = xNombre;
        nota1 = xNota1;
        nota2 = xNota2;
        nota3 = xNota3;
        practicas = xPracticas;
    }
    public Alumno (int xDni, String xNombre, String xApellidos){
        dni = xDni;
        apellidos = xApellidos;
        nombre = xNombre;
    }
    //GETTERS
    public int getDni(){
        return dni;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getNombre(){
        return nombre;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
    public double getPracticas(){
        return practicas;
    }
    //SETTERS
    public void setNota1(double nota){
        nota1 = nota;
    }
    public void setNota2(double nota){
        nota2 = nota;
    }
    public void setNota3(double nota){
        nota3 = nota;
    }
    public void setPracticas(double nota){
        practicas = nota;
    }
    //ToString
    public String ToString(){
        return dni + CalculaLetra(dni) + " - " + apellidos + ", " + nombre + ": " + nota1 +", " + nota2 + ", " + nota3 +", " + practicas;
    }
      private String CalculaLetra(int numero){
        String Cadena="TRWAGNYFPDXBNJZSQVHLCKE";
        return Character.toString(Cadena.charAt(numero%23));
        //return (Cadena.char(numero%23).toString());
    }
    public String Boletin(){
        NumberFormat formatoNota = NumberFormat.getCurrencyInstance();
        String cadena = "-------"+
                        "BOLETIN\n" + 
                        "-------\n" +
                dni + CalculaLetra(dni) + " " + apellidos + ", " + nombre +
             "\n------------------------------------------------" + 
             "\nBLOQUE 1 : " + nota1 + " - " + devuelveNota(nota1) + " --------------        FINAL: " + formatoNota.format(nota1*0.15) +
             "\nBLOQUE 2 : " + nota2 + " - " + devuelveNota(nota2) + " --------------        FINAL: " + formatoNota.format(nota2*0.15) +
             "\nBLOQUE 3 : " + nota3 + " - " + devuelveNota(nota3) + " --------------        FINAL: " + formatoNota.format(nota3*0.15) +
             "\nPRACTICAS: " + practicas + " - " + devuelveNota(practicas) + " --------------        FINAL: " + formatoNota.format(practicas*0.55)+
             "\n------------------------------------------------" + 
             "\n                         TOTAL : " + formatoNota.format((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " - " + devuelveNota((nota1*0.15)+(nota2*0.15)+(nota3*0.15)+(practicas*0.55)) + " -";
        return cadena;
    }
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
