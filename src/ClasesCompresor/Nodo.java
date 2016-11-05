/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;
/**
 * Esta es la clase Nodo que se va a agregando a la cola y tiene un dato de tipo ArbolBinario 
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class Nodo{
    /**
     * Esta es la variable dato de tipo ArbolBinario
     */
    private ArbolBinario dato;
    /**
     * Esta es la variable siguiente de tipo Nodo
     */
    private Nodo siguiente;
    /**
     * Este es el constructor por default de la clase Nodo que inicializa las variabldes 
     * dato y siguiente en null 
     */
    public Nodo(){
        dato = null;
        siguiente = null;
    }
    /**
     * Este es el constructor de la clase Nodo que le asigna un valor a la variable dato segun el dato que se le 
     * pase como parametro e inicializa la variable siguiente en null
     * @param dato 
     */
    public Nodo(ArbolBinario dato){
        this.dato = dato;
	siguiente = null;
    }
    /**
     * Este es el metodo get de la variable dato
     * @return dato
     */
	public ArbolBinario getDato() {
		return dato;
	}
        /**
         *  Este es el metodo set de la variable dato
         * @param dato 
         */
	public void setDato(ArbolBinario dato) {
		this.dato = dato;
	}
        /**
         *  Este es el metodo get de la variable siguiente
         * @return siguiente
         */
	public Nodo getSiguiente() {
		return siguiente;
	}
        /**
         *  Este es el metodo set de la variable siguiente
         * @param siguiente 
         */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
        /**
         * Este es el metodo toString() de la clase Nodo que sobreescribe el toString de la clase Object e
         * imprime el dato del nodo
         * @return el dato del nodo
         */
	public String toString(){
		return "["+dato+"]";
	}
}
