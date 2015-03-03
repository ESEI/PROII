/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uxi
 */
import java.util.Scanner;
import java.time.LocalTime;
public class Practica2 {
    public static void main (String args[]){
        //Ejercicio 1
        System.out.println("Ejercicio 1:");
        Ejercicio1.ejercicio1();
        //Ejercicio 2
        System.out.println("Ejercicio 2:");
        Ejercicio2.ejercicio2();
        
        //Ejercicio4:      
        System.out.println("Ejercicio 4:");
        Ejercicio4_Polinomios p1 = new Ejercicio4_Polinomios();
        //Ejercicio 4.a con dos vectores
        System.out.println(p1);
        //Ejercicio 4.b con un vector
        System.out.println(p1.toString2());
        //Ejercicio 4.c con dos clases
        Scanner entrada = new Scanner (System.in);
        int dato;
        do{
            System.out.print("Introduzca el grado del polinomio: ");
            dato = entrada.nextInt();
        } while (dato <0);
        Ejercicio4_c_Polinomios p2 = new Ejercicio4_c_Polinomios(dato+1);
        for(int i=p2.getMaxElementos()-1; i>=0;i--){
            System.out.print("Introduzca el coeficiente para el grado " + (i) + ": ");
            dato = entrada.nextInt();
            p2.inserta(dato);
        }
        System.out.println(p2.toString());
        
        //Ejercicio 3:
        System.out.println("Ejercicio 3:");
        Ejercicio3_ProgramaRadio[] programas = new Ejercicio3_ProgramaRadio[24];
        Scanner scan = new Scanner(System.in);
        String titulo,locutor;
        long duracion;
        int i=0;
        do{
            // Pedimos el titulo   
            System.out.print("Introduzca el titulo: ");
            titulo=scan.nextLine();
            
            // Pedimos el locutor
            System.out.print("Introduzca el nombre del locutor: ");
            locutor=scan.nextLine();
            
            try{
                       
            // Pedimos la duracion
            System.out.print("Introduzca la duración del programa: ");
            duracion=Long.parseLong(scan.nextLine());
            
            if (Ejercicio3_ProgramaRadio.getHoraContador() + duracion>1440){
                    throw new Exception("Duracion total sobrepasada.");
                }
            
            // Creamos el programa
            programas[i]=new Ejercicio3_ProgramaRadio(titulo,locutor,duracion);
            //INFO
            System.out.println(programas[i]);
                
           }
           catch(NumberFormatException exc){
               System.err.println("Debe introducir numeros positivos.");
           }
           catch(Exception exc){
               System.err.println("ERROR: "+exc.getMessage());
           }
        }while(Ejercicio3_ProgramaRadio.getHoraContador()<1440);
        System.out.println("FIN");
    }    
}
