
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Modificacion del Ejercicio para sumar dos polinomios
 * @author uxi
 */
public class Ejercicio4_d_Polinomios {
    private Polinomio[] polinomios;
    private int num;
    
    /** Constructor
     * 
     * @param numPolinomios numero maximo de polinomios, como int
     * @throws Exception Devuelve error si el numero de polinomios es menor de 2
     */
    public Ejercicio4_d_Polinomios(int numPolinomios) throws Exception{
        if(numPolinomios<2){
            throw new Exception("Debe insertar como mínimo 2 polinomios."); 
        }
        polinomios = new Polinomio[numPolinomios];
        num = 0;
    }
        
    //GETTERS
    /** Devuelve el numero maximo de polinomios
     * 
     * @return numero maximo de poinomios, como int
     */
    public int getNumPolinomios(){
        return polinomios.length;
    }
    
    /** Inserta un Polinomio
     * 
     * @param p posicion en el array de polinomios, int
     */
    public void insertaPolinomio(int p){
        Scanner entrada = new Scanner (System.in);
        int dato;
       
         do{
            System.out.print("Introduzca el grado del polinomio("+(p+1)+"): ");
            dato = entrada.nextInt();
            
            try{

            polinomios[p]= new Polinomio(dato+1);
            num+=1;
            for(int i=polinomios[p].getMaxElementos()-1; i>=0;i--){
                System.out.print("Introduzca el coeficiente para el grado " + (i) + ": ");
                dato = entrada.nextInt();
                polinomios[p].inserta(dato);
            }
            //System.out.println(polinomios[p]);


            }
            catch(Exception exc){
                System.err.println(exc.getMessage());
                dato =-1;
            }
        } while (dato <0);
        
    }
    
    /** Suma los polinomios introducidos
     * 
     * @return la suma de los polinomios, como String
     */
    public String suma() throws Exception{
        int result[];
        int mayorGrado=0;
        int cont=0;
        for(int i=0; i<num;i++){
            if (polinomios[i].getMaxElementos()>mayorGrado){
                mayorGrado=polinomios[i].getMaxElementos();
            }
        }
        result = new int[mayorGrado];
        //inicializamos valores para el vector:
        for(int valor:result){
            valor=0;
        }
        //for(Polinomio pol: polinomios){
        for (int x = 0; x<polinomios.length;x++){    
            for (Elemento elem: polinomios[x].getElementos()){
                    result[cont]+=elem.getCoeficiente();
                    cont++;
            }
            cont = 0;
        }
        return formateaPolinomio(result);
    }
    
    /** Devuelve el polinomio de mayor a menor grado, formateado
     * 
     * @param vector el polinomio a formatear, como int[]
     * @return el polinomio formateado, como String
     */
    public String formateaPolinomio(int[] vector) throws Exception{
        StringBuilder sb = new StringBuilder("");       
        for(int i=vector.length-1; i>=0;i--){
            if (vector[i]>0){
                if (vector[i]>1){
                    sb.append(vector[i]);
                }
                if (i>0){
                    sb.append("x" + ((i>1)?"^"+i:""));
                }else if (vector[i]==1){
                    sb.append("1");
                } 
            }
            try{
                if ((sb.length()>0) && ((i)>0) && (vector[i-1]>0)){
                    sb.append("+");
                }
            }catch (Exception exc){             
                 //sb.append("**ERROR al formatear el polinomio**");
                 throw new Exception ("**ERROR al formatear el polinomio**");
            }
        }
        return sb.toString();
    }
    
    /** Devuelve los polinomios
     * 
     * @return los polinomios, como String
     */
    public String toString(){
        StringBuilder sb = new StringBuilder("");       
        for(int i=0; i<num;i++){
            sb.append(polinomios[i]+"\n");
        }
        return sb.toString();
    }
        
}
