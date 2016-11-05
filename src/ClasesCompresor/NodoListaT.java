/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;
/**
 * Esta es la clase NodoListaT el cual se utiliza en la lista doblemente ligada de la clase ListaTabla
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class NodoListaT
{    
     /**
      * Esta es la variable Dato2 de tipo String
      */
     private String Dato2;
     /**
      * Esta es la variable ubicacion de tipo String
      */
     private String ubicacion;
     /**
      * Esta es la variable dato de tipo ArbolBinario
      */
     private ArbolBinario dato;
     /**
      * Estas son las variables anterior y siguiente 
      */
     private NodoListaT  siguiente, anterior;
     /**
      * Este es el constructor de la clase en el cual se le asigna un valor a la variable dato
      * y se inicializan las variables anterior y siguiente en null
      * @param dato 
      */
     public NodoListaT (ArbolBinario dato)
    {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }
    /**
     * Este es el constructor de la clase en cual se le asigna un valor a la variable dato
     * y a la variable ubicacion y se cambia el valor de la variable siguiente a null
     * @param valor
     * @param ub 
     */
    public NodoListaT(String valor,String ub){
            this.setDato2(valor);
            this.setSiguiente(null);
            this.setUbicacion(ub);
    }
    /**
     * Este es el metodo set de la variable dato
     * @param x 
     */
    public void setDato(ArbolBinario x)
    {
        dato = x;
    }
    /**
     * Este es el metodo get de la variable dato
     * @return dato
     */
    public ArbolBinario getDato()
    {
        return dato;
    }
    /**
    * Este es el metodo set de la variable siguiente
     * @param s es el nodo siguiente
     */
    public void setSiguiente(NodoListaT s)
    {
        siguiente = s;
    }
    /**
     * Este es el metodo get de la variable siguiente
     * @return siguiente
     */
    public NodoListaT getSiguiente()
    {
        return siguiente;
    }
    /**
     * Este es el metodo get de la variable anterior
     * @return anterior
     */
    public NodoListaT getAnterior() {
        return anterior;
    }
    /**
     * Este es el metodo set de la variable anterior
     * @param anterior 
     */
    public void setAnterior(NodoListaT anterior) {
        this.anterior = anterior;
    }
    /**
     * Este es el metodo get de la variable ubicacion
     * @return ubicacion
     */
    public String getUbicacion() {
		return ubicacion;
    }
    /**
     * Este es el metodo set de la variable ubicacion
     * @param ubicacion 
     */
    public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
    }
    /**
     * Este es el metodo get de la variable Dato2
     * @return 
     */
    public String getDato2() {
            return Dato2;
    }
    /**
     * Este es el metodo set de la variable Dato2
     * @param dato 
     */
    public void setDato2(String dato) {
            Dato2 = dato;
    }
}

