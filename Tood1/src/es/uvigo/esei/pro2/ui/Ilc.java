package es.uvigo.esei.pro2.ui;

import es.uvigo.esei.pro2.core.Bloc;
import es.uvigo.esei.pro2.core.Tarea;

import java.util.Scanner;

/**
 * Interfaz de lin. de comando para Tood
 * Created by baltasarq on 28/01/2015.
 */
public class Ilc {
    /**
     * Realiza el reparto de la funcionalidad
     */
    public void leb()
    {
        int op;

        // Lee el num. max. de tareas
        int maxTareas;
        do{
            maxTareas = leeNum( "Num. max. tareas: " );
        } while (maxTareas <=0);
        // Prepara
        Bloc bloc = new Bloc( maxTareas );

        // Bucle ppal
        do {
            System.out.println( "----\n" + "Tood");

            op = menu(bloc);

            switch( op ) {
                case 0:
                    System.out.println( "Fin." );
                    break;
                case 1:
                    insertaTarea( bloc );
                    break;
                case 2:
                    if (bloc.getNumTareas()>0){
                        modificaTarea( bloc.get( leeNumTarea( bloc ) ) );
                    }else{
                        System.out.println("No existen tareas para modificar.");
                    }
                    break;
                case 3:
                    if (bloc.getNumTareas()>0){
                        bloc.borra( leeNumTarea( bloc ) );
                    }else{
                        System.out.println("No existen tareas para borrar.");
                    }
                    break;
                case 4:
                    if (bloc.getNumTareas()>0){
                        bloc.get( leeNumTarea( bloc ) ).setCompletada();
                    }else{
                        System.out.println("No existen tareas para marcar como completadas.");
                    }
                    break;
                case 5:
                    System.out.println( bloc.toString() );
                    break;
                    /* //CODIGO ANTERIOR
                    for(int i = 0; i < bloc.getNumTareas(); ++i) {
                        System.out.println( bloc.get( i ).toString() );
                    }
                    */     
                default:
                    System.out.println( "No es correcto: " + op );
            }
        } while( op != 0 );

        return;
    }

    /**
     * Presenta un menu con las opciones, y permite seleccionar una.
     * @param numTareas Numero de entradas
     * @param maxTareas numero maximo de tareas
     * @return la opcion seleccionada, como entero
     */
    private int menu(Bloc bloc)
    {
        int toret;

        do {
            System.out.println("-------------------------\n"
                            + "Nº de entradas : " + bloc.getNumTareas() + "\n"
                            + "Nº de entradas maximo : " + bloc.getMaxTareas() + "\n"
                            + "-------------------------\n"
                            + "1. Inserta nueva tarea\n"
                            + "2. Modifica tarea\n"
                            + "3. Elimina tarea\n"
                            + "4. Marcar tarea como completada\n"
                            + "5. Listar\n"
                            + "0. Salir\n" );
            toret = leeNum( "Selecciona: " );
        } while( toret < 0
              && toret > 4 );

        return toret;
    }

    /**
     *  Crea una nueva tarea y la inserta en el bloc.
     *  @param bloc El Bloc en el que insertar la tarea.
     */
    private void insertaTarea(Bloc bloc)
    {
        if (bloc.getNumTareas()>= bloc.getMaxTareas()){
            System.out.println("No se pueden insertar más tareas.");
        }else{
            Tarea t = new Tarea( "" );
            modificaTarea( t );
            bloc.inserta( t  );   
        }
    }

    /**
     * Modifica una tarea existente.
     * @param t La tarea a modificar.
     */
    private void modificaTarea(Tarea t)
    {
        String info;
        Scanner entrada = new Scanner( System.in );

        // Texto
        System.out.print( "Texto de la tarea " );
        if ( t.getTexto().length() > 0 ) {
            System.out.print( "[" + t.getTexto() + "]" );
        }
        System.out.print( ": " );
        info = entrada.nextLine().trim();

        if ( info.length() > 0 ) {
            t.setTexto( info );
        }

        // Completitud
        System.out.print( "Completada (s/n) " );
        if ( t.estaCompletada() ) {
            System.out.print( "[S]: ");
        } else {
            System.out.print( "[N]: ");
        }
        info = entrada.nextLine().trim().toUpperCase();

        if ( info.length() > 0 ) {
            t.setCompletada( info.charAt( 0 ) == 'S' );
        }
        
        // Prioridades
        String[] p = t.getPrioridades();
        System.out.print( "Prioridad (");
        for (int i = 0; i < p.length;i++){    
            System.out.print("["+(i+1)+"]"+p[i].charAt(0)+ p[i].substring(1).toLowerCase()+ ((i+1>=p.length)? ")":", "));
        }
        System.out.print( "[" + t.getPrioridad() + "]: ");
        try
        {        
            info = entrada.nextLine().trim();
            if ((info.length()>0) && ((Integer.parseInt(info)>0)||(Integer.parseInt(info)<=p.length))){        
                t.setPrioridad(p[Integer.parseInt(info)-1]);
            }
        }
        catch (Exception ex){
            //System.out.println("ERROR: " + ex.getMessage());
        }
    }

    /**
     * Lee del teclado un nuevo num. de tarea
     * @param bloc el Bloc, del que se obtiene el max.
     * @return el num. de tarea, como entero.
     */
    private int leeNumTarea(Bloc bloc)
    {
        final int numTareas = bloc.getNumTareas();
        int toret;

        do {
            toret = leeNum( "Introduzca num. de tarea (1..." + numTareas + "): " );
        } while(( toret <= 0)
              || (toret > numTareas) );

        return toret-1;
    }

    /**
     * Lee un num. de teclado
     * @param msg El mensaje a visualizar.
     * @return El num., como entero
     */
    public static int leeNum(String msg)
    {
        boolean repite;
        int toret = 0;
        Scanner entrada = new Scanner( System.in );

        do {
            repite = false;
            System.out.print( msg );

            try {
                toret = Integer.parseInt( entrada.nextLine() );
            } catch (NumberFormatException exc) {
                repite = true;
            }
        } while( repite );

        return toret;
    }
}