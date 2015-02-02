package es.uvigo.esei.pro2.core;

/**
 * Representa una tarea
 * Created by baltasarq on 27/01/15.
 */
public class Tarea {
    private boolean completada;
    private String texto;

    /** Crea una nueva tarea, con un texto
     * @param t el texto de la tarea
     */
    public Tarea(String t)
    {
        completada = false;
        texto = t;
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

        toret += getTexto();

        return toret;
    }
}
