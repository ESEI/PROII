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
        try{
            if ( pos > getNumTareas() ) {
            //System.err.println( "get(): sobrepasa la pos: " + ( pos + 1 ) + " / " + getMaxTareas() );
            //System.exit( -1 );
                throw new Exception ("get(): sobrepasa la pos: " + ( pos + 1 ) + " / " + getMaxTareas());
            }       
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
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
        try{
            if ( getNumTareas() >= maxTareas ) {
                /*System.err.println( "inserta(): sobrepasa max.: " + maxTareas );
                System.exit( -1 );*/
                throw new Exception ("inserta(): sobrepasa max.: " + maxTareas);
            }

            tareas[ num ] = t;
            ++num;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void borra(int pos)
    {
        final int numTareas = getNumTareas();
    try {
        if ( pos >= numTareas ) {
            /*System.err.println( "borra(): sobrepasa el max.: " + numTareas );
            System.exit( -1 );*/
            throw new Exception ("borra(): sobrepasa el max.: " + numTareas);
        }

        //...
            for (int posicion = pos; posicion < (getNumTareas()-1); posicion++){
                tareas[posicion]= tareas[posicion+1];
            }
        num -=1;
    }
    catch (Exception ex){
        System.out.println(ex.getMessage());
    }
    
    //    return;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder ("");
        
        try{
            if (this.getNumTareas()<1){
                throw new Exception ("Todavia no se ha introducido ninguna tarea.");
            }
            for (int i =0; i< num;i++){
                sb.append(tareas[i].toString() + ((i+1>=num)? "":"\n"));
            }
        }
        catch (Exception ex){
            sb.append(ex.getMessage());
        }
        return sb.toString();
    }
}
