package es.uvigo.esei.pro2.core;

/**
 * Bloc de tareas
 * Created by baltasarq on 27/01/15.
 */
public class Bloc {
    private Tarea[] tareas;
    private int num;

    /** Nuevo Bloc, con un num. max. de tareas.
     * @param maxTareas el num. max. de tareas, como entero.
     */
    public Bloc(int maxTareas)
    {
        num = 0;
        tareas = new Tarea[ maxTareas  ];
    }

    /**
     * Devuelve la tarea en pos
     * @param pos el lugar de la tarea en el vector de tareas
     * @return el objeto Tarea correspondiente.
     */
    public Tarea get(int pos)
    {
        if ( pos >= getNumTareas() ) {
            System.err.println( "get(): sobrepasa la pos: " + ( pos + 1 ) + " / " + getMaxTareas() );
            System.exit( -1 );
        }

        return tareas[ pos ];
    }

    /** Devuelve el num. de tareas creadas.
     * @return el num. de tareas disponibles, como entero.
     */
    public int getNumTareas()
    {
        return num;
    }

    /** Devuelve el max. de tareas
     * @return el num. de tareas max,, como entero
     */
    public int getMaxTareas()
    {
        return tareas.length;
    }

    /** Inserta una nueva tarea
     * @param t la nueva Tarea
     */
    public void inserta(Tarea t)
    {
        final int maxTareas = getMaxTareas();

        if ( getNumTareas() >= maxTareas ) {
            System.err.println( "inserta(): sobrepasa max.: " + maxTareas );
            System.exit( -1 );
        }

        tareas[ num ] = t;
        ++num;
    }

    public void borra(int pos)
    {
        final int numTareas = getNumTareas();

        if ( pos >= numTareas ) {
            System.err.println( "borra(): sobrepasa el max.: " + numTareas );
            System.exit( -1 );
        }

        //...

        return;
    }

    public String toString()
    {
        return "";
    }
}
