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
        System.out.println (UnCorreo.getApellidos());
        System.out.println (UnCorreo.getNombre());
        System.out.println (UnCorreo.getUsuario());
        System.out.println (UnCorreo.getServidor());
        System.out.println (UnCorreo.ToString());  
        Correo Correo2 = new Correo("Gonzalez Fernandez","Jose Eugenio");
        System.out.println (Correo2.getApellidos());
        System.out.println (Correo2.getNombre());
        System.out.println (Correo2.getUsuario());
        System.out.println (Correo2.getServidor());
        System.out.println (Correo2.ToString());  
        //Ejercicio 3
        Personas yo = new Personas("Gonzalez Fernandez", "Jose Eugenio", 53111974);
        System.out.println(yo.ToString());
        //Ejercicio 4
        Poligonos mypoli = new Poligonos(4);
        System.out.println(mypoli.ToString());
        System.out.println(mypoli.angulos());
        //Ejercicio 5
        Coches micoche = new Coches("Hyundai","Coupe",3,100,3,110);
        System.out.println(micoche.ToString());
        //Ejercicio 6
        Articulo nuevoArt = new Articulo ("ZARA",12345678,40,19.95);
        System.out.println(nuevoArt.ToString());
        //Ejercicio 7
        Alumno alum1 = new Alumno(53111974,"Jose Eugenio", "Gonzalez Fernandez");
        alum1.setNota1(5.2);
        alum1.setNota2(1.2);
        alum1.setNota3(6.2);
        alum1.setPracticas(9.2);
        System.out.println(alum1.ToString());
        System.out.println(alum1.Boletin());
    }
    
}