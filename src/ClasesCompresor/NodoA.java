/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;

/**
 * Esta es la clase NodoA que corresponde a un nodo de tipo Arbol
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class NodoA {
    /**
     * Esta es la variable dato del nodo que es de tipo Caracter
     */
    private  Caracter dato;
    /**
     * Estas son las variables izquierda y derecha de tipo NodoA
     */
    private NodoA izquierda, derecha;
    /**
     * Este es el constructor de la clase el cual le asigna un valor a la variable dato e
     * inicializa las variables izquierda y derecha en null
     * @param dato 
     */
    public NodoA(Caracter dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
    /**
     * 
     * @param dato
     * @param izquierda
     * @param derecha 
     */
    public NodoA(Caracter dato, NodoA izquierda, NodoA derecha) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    /**
     * Este es el metodo get de la variable dato
     * @return 
     */
    public Caracter getDato() {
        return dato;
    }
    /**
     * Este es el metodo set de la variable dato
     * @param dato 
     */
    public void setDato(Caracter dato) {
        this.dato = dato;
    }
    /**
     * Este es el metodo get de la variable derecha que es una liga a el nodo derecho
     * @return derecha
     */
    public NodoA  getDerecha()
    {
        return derecha;
    }
    /**
     * Este es el metodo set de la variable derecha
     * @param s 
     */
    public void setDerecha(NodoA s)
    {
        derecha = s;
    }
    /**
     * Este es el metodo set de la variable izquierda
     * @param a 
     */
    public void setIzquierda(NodoA a)
    {
        izquierda = a;
    }
    /**
     * Este es el metodo get de la variable izquierda
     * @return izquierda
     */
    public NodoA getIzquierda()
    {
        return izquierda;
    }
}

