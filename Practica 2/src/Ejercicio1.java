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

public class Ejercicio1 {

    public static void ejercicio1 ()
        {
            String linea;
            int[] v;
            int num;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int suma = 0;
            int media;
            Scanner scan = new Scanner( System.in );

            try {
                // Pedir max.
                System.out.print( "\nIntroduzca max.: " );
                linea = scan.nextLine();
                num = Integer.parseInt( linea );

                if ( num <= 0 ) {
                 throw new Exception( "No se puede crear un array primitivo sin elementos: "
                                            + num);
                }

                // Crea el vector
                v = new int[ num ];

                // Lectura de valores para el vector.
                for(int i = 0; i < num; ++i) {
                    System.out.print( "Introduzca num. " + ( i + 1 ) + ": " );
                    linea = scan.nextLine();
                    v[ i ] = Integer.parseInt( linea );
                    suma += v[ i ];
                   
                    if ( min > v[ i ] ) {
                        min = v[ i ];
                    }

                    if ( max < v[ i ] ) {
                        max = v[ i ];
                    }
                }

                // Mostrar resultados
                media = suma / num;
                System.out.println( "\nMax.: " + max );
                System.out.println( "Min.: " + min );
                System.out.println( "Media: " + media );

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
