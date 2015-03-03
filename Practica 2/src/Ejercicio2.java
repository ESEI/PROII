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
public class Ejercicio2 {
        public static int divide(int a, int b)
        {
            return a / b;    
        }

        public static void ejercicio2 ()
        {
            int num1;
            int num2;
            String linea;
            Scanner scan = new Scanner( System.in );
            try {
                System.out.print( "\nIntroduzca dividendo: " );
            linea = scan.nextLine();
            num1 = Integer.parseInt( linea );

            System.out.print( "\nIntroduzca divisor: " );
            linea = scan.nextLine();
            num2 = Integer.parseInt( linea );
            if ( num2 == 0 ) {
                throw new Exception( "No se puede dividir entre cero.");
            }
            System.out.println( "\nEl resultado es: " + divide( num1, num2 ) );
            }
            catch(NumberFormatException exc)
            {
                System.err.println( "ERROR de formato numérico" );
            }
            catch(Exception exc)
            {
                System.err.println( "ERROR inesperado: \n" + exc.getMessage() );
            }            
        }
    }