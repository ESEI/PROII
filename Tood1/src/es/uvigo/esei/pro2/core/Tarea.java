package es.uvigo.esei.pro2.core;

/**
 * Representa una tarea
 * Created by baltasarq on 27/01/15.
 */
public class Tarea {
    private boolean completada;
    private String texto;
    private enum Prioridades {BAJA, NORMAL, ALTA};
    private Prioridades prioridad;
    
    /** Crea una nueva tarea, con un texto
     * @param t el texto de la tarea
     */
    public Tarea(String t)
    {
        completada = false;
        texto = t;
        prioridad = Prioridades.NORMAL;
    }
    
    /** Determina si la tarea ha sido completada.
     * @return true si ha sido completada, false en otro caso.
     */
    public boolean estaCompletada()
    {
        return completada;
    }

    /** Devuelve el texto de la tarea
     * @return el texto de la tarea, como String.
     */
    public String getTexto()
    {
        return texto;
    }
    
    /** Devuelve el contenido del enumerado Prioridades
     * 
     * @return el contenido del enumerado, como array.
     */
    public String[] getPrioridades(){
        String[] toret = new String[Prioridades.values().length];
        for (Prioridades p: Prioridades.values()){
            toret[p.ordinal()]=p.toString();
        }
        return toret;
    }
    
    /** Devuelve el texto Prioridad del enumerado
     * 
     * @return el texto Prioridad del enumerado, como String.
     */
    public String getPrioridad()
    {
        return prioridad.toString();
    }

    /** Cambia el texto de la tarea
     * @param t el texto de la tarea
     */
    public void setTexto(String t)
    {
        texto = t.trim();
    }

    /** Pone la tarea a completada
     */
    public void setCompletada()
    {
        setCompletada( true );
    }
    /** Establece la prioridad de la tarea
     * 
     * @param myPrioridad el nombre de la prioridad del enumerado, como string.
     */
    public void setPrioridad(String MyPrioridad){
        prioridad = Prioridades.valueOf(MyPrioridad);
    }

    /**
     * Cambia el completado de la tarea.
     * @param c true para indicar tarea completada, false en otro caso.
     */
    public void setCompletada(boolean c)
    {
        completada = c;
    }

    public String toString()
    {
        String toret = estaCompletada() ? "[X]  " : "[ ]  ";
        toret += "[" + getPrioridad() +"] ";

        toret += getTexto();

        return toret;
    }
}
