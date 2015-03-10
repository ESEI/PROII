/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uxi
 */
public class Ejercicio4_c_Polinomios {
    private Elemento[] elementos;
    private int num;
    
    public  Ejercicio4_c_Polinomios(int gradoPolinomio)throws Exception {
         if(gradoPolinomio<0){
            throw new Exception("El grado debe ser mayor que 0"); 
        }
        elementos = new Elemento[gradoPolinomio];
        num=gradoPolinomio-1;
    }
       
    /** Devuelve el max de elementos
     * 
     * @return el max de tareas, como int
     */
    public int getMaxElementos(){
        return elementos.length;
    }
    
    /**Inserta un nuevo elemento
     * 
     * @param coef el coeficiente del nuevo elemento, como int
     * @throws Exception 
     */
    public void inserta(int coef) {//throws Exception{
        try{
            elementos[num] = new Elemento(coef, num) ;
        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }
        --num;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder("");       
        for(int i=elementos.length-1; i>=0;i--){
            if (elementos[i].getCoeficiente()>0){
                if (elementos[i].getCoeficiente()>1){
                    sb.append(elementos[i].getCoeficiente());
                }
                if (elementos[i].getGrado()>0){
                    sb.append("x" + ((elementos[i].getGrado()>1)?"^"+elementos[i].getGrado():""));
                }else if (elementos[i].getCoeficiente()==1){
                    sb.append("1");
                } 
            }
            try{
                if ((sb.length()>0) && ((elementos[i].getGrado())>0) && (elementos[i-1].getCoeficiente()>0)){
                    sb.append("+");
                }
            }catch (Exception exc){
                    
            }
        }
        return sb.toString();
    }
}
