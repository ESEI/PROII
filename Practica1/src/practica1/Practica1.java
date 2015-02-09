/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author uxi
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Ejercicio 1
        Ejercicio1 p1 = new Ejercicio1( 5, 5 );
        System.out.println( "La distancia a "
                    + Ejercicio1.ORIGEN + " es "
                    + p1.calculaDistanciaOrigen() );
        //Ejercicio 2
        Correo UnCorreo = new Correo("Gonzalez Fernandez", "Uxio","uxiogonzalez","hotmail.com");
        System.out.println (UnCorreo.toString());  
        Correo Correo2 = new Correo("Gonzalez Fernandez","Jose Eugenio");
        System.out.println (Correo2.toString());  
        //Ejercicio 3
        Personas yo = new Personas("Gonzalez Fernandez", "Jose Eugenio", 53111974);
        System.out.println(yo.toString());
        //Ejercicio 4
        Poligonos mypoli = new Poligonos(4);
        System.out.println(mypoli.toString());
        System.out.println(mypoli.angulos());
        //Ejercicio 5
        Coches micoche = new Coches("Hyundai","Coupe",3,100,3,110);
        System.out.println(micoche.toString());
        //Ejercicio 6
        Articulo nuevoArt = new Articulo ("ZARA",12345678,40,19.95);
        System.out.println(nuevoArt.toString());
        //Ejercicio 7
        Alumno alum1 = new Alumno(53111974,"Jose Eugenio", "Gonzalez Fernandez");
        //alum1.setNota(Notas.BLOQUE1, 5.2);
        
        System.out.println(alum1.toString());
        //System.out.println(alum1.Boletin());
    }
    
}
