/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;
/**
 * Esta es la clase ArbolBinario la cual nos servira para poder crear el arbol binario a
 * utilizar para comprimir y descomprimir nuestro archivo
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class ArbolBinario {
    /**
     * Este es el nodo raiz del arbol
     */
   private NodoA raiz;
   /**
    * Este es el constructor de la clase ArbolBinario que inicializa la raiz en null
    */
    public ArbolBinario()
    {
        raiz = null;
    }
    /**
     * Este es el metodo get de la variable raiz
     * @return raiz 
     */
    public NodoA getRaiz() {
        return raiz;
    }
    /**
     * Este es el metodo set de la variable raiz
     * @param raiz 
     */
    public void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }
    /**
     * Este es el metodo estaVacio() el cual vacia el arbol binario
     * @return 
     */
    public boolean estaVacio ()
    {
        return raiz == null;
    }
    /**
     * Este es el metodo preOrden() en el cual se manda a llamar al metodo mPreOrden()
     */
    public void preOrden()
    {
        mPreOrden(raiz);
    }
    /**
     * Este es el metodo mPreOrden() en el cual se recorre el arbol binario visitando la raiz,
     * siquiendo por la rama izquiera y despues por la rama derecha
     * @param raiz 
     */
    private void mPreOrden(NodoA raiz)
    {
       
        if (raiz != null){
            System.out.println(raiz.getDato().toString());
            mPreOrden(raiz.getIzquierda());            
            mPreOrden(raiz.getDerecha());             
        }
    }
    /**
     * Este es el metodo insertar de la clase ArbolBinario 
     * en el cual se compara el valor del dato a insertar con los demas para insertarlos de manera ordenada
     * @param x
     * @param dato
     * @return un valor de tipo booleano 
     */
    public boolean insertar (Comparable x, Caracter dato)
    {
        NodoA aux = new NodoA (dato);
        if (aux == null)
            return false;

        if (raiz == null)
            raiz = aux;
        else {
            NodoA  aux2 = raiz;
            NodoA  ant = null;
            while(aux2 != null) {
                ant = aux2;
                if(x.compareTo(aux2.getDato())< 0)
                    aux2 = aux2.getIzquierda();
                else 
                    aux2 = aux2.getDerecha();
            }
            if (x.compareTo(ant.getDato())<0)
                ant.setIzquierda(aux);
            else
                ant.setDerecha (aux);
        }
        return true;
    }
    
}
