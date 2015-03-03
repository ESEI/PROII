/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uxi
 */
import java.time.LocalTime;
public class Ejercicio3_ProgramaRadio {
   
    private LocalTime hora= LocalTime.MIN;
    public static long horaContador=0;
    private long minutos;
    private String titulo;
    private String locutor;

    /** Constructor
     * 
     * @param titulo El titulo del programa
     * @param locutor el locutor del programa
     * @param minutos los minutos de duracion del programa
     * @throws Exception si la duracion es menor de 60 minutos
     */
    public Ejercicio3_ProgramaRadio(String titulo, String locutor, long minutos)throws Exception
    {
        if(minutos<60){
            throw new Exception(" La duracion minima es de 60 minutos");
        }

        this.titulo=titulo;
        this.locutor=locutor;
        this.minutos=minutos;
        this.hora = hora.plusMinutes(horaContador);
        horaContador += minutos;
    }

    //GETTERS
    /** Devuelve la hora de comienzo del programa
     * 
     * @return hora, como LocalTime
     */
    public LocalTime getHora() {
        return hora;
    }
    
    public static long getHoraContador(){
        return horaContador;
    }

    /** Devuelve los minutos de duracion del programa
     * 
     * @return minutos, como long
     */
    public long getMinutos() {
        return minutos;
    }

    /**Devuelve el titulo del programa
     * 
     * @return titulo, como String
     */
    public String getTitulo() {
        return titulo;
    }

    /** Devuelve el locutor del programa
     * 
     * @return locutor, como String
     */
    public String getLocutor() {
        return locutor;
    }

    /** Devuelve toString
     * 
     * @return informacion sobre el programa, como String
     */
    public String toString(){

        return "-------------\nEL título del programa es: "+getTitulo()+"\nLocutor: "+getLocutor()+"\nDuración: "+getMinutos()+" minutos\nHora de Inicio: "+getHora()+"\nHora de Finalización: "+ getHora().plusMinutes(getMinutos()) +"\n-------------\n";
    }
            
}


