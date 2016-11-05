/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;
/**
 * Esta es la clase ColaArboles la cual nos sirve para agregar los nodos a la cola 
 * y que de esta manera sea mas facil manipular los datos, los datos se ira agregando a la cola.
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class ColaArboles {
   /**
    * Este es la variable cabecera de tipo Nodo la cual es el inicio de la cola
    */
   private Nodo cabecera;
   /**
    * Esta es la variable size de tipo int la cual nos servira para saber cual es el tamaño de la cola
    */
     private int size;
     /**
      * Este es el constructor de la clase el cual inicializa la variable cabecera(inicio) en null 
      * y le asigna a la cola un tamaño de 0
      */
    public ColaArboles ()
    {
        cabecera = null;
        size = 0;
    }
    /**
     * Este es el metodo set de la variable cabecera
     * @param cabecera 
     */
    public void setCabecera(Nodo cabecera) {
        this.cabecera = cabecera;
    }
    /**
     * Este es el metodo agregar de la clase el cual nos servira para agregar el dato de tipo ArbolBinario
     * a la cola
     * @param dato 
     */
    public void agregar(ArbolBinario dato)
    {
        Nodo nuevo = new Nodo(dato);
        if (cabecera == null){
            cabecera = nuevo;
        }else{
            Nodo aux = cabecera;
            while(aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    /**
     * Este es el metodo recorrer de la clase el cual nos sirve para recorrer la cola
     * @return 
     */
    public String recorrer () 
    {   
        String s = " ";
        Nodo aux = cabecera;
        while(aux!= null){
            s+= aux.getDato().getRaiz().getDato().getCaracter() + "\t| Frecuencia: \t" + aux.getDato().getRaiz().getDato().getFrecuencia() + "\n";
            aux = aux.getSiguiente();
        }
        return s;
    }
    /**
     * Este es el metodo contarCaracteres el cual servira para contar las frecuencias
     * @param poli2 es la cola 
     */
    public void contarCaracteres(ColaArboles poli2){
        Nodo aux = cabecera;        
        Nodo aux2;
        int sumatoria = 0;
        while(aux != null){
            
            aux2 = aux.getSiguiente();
            sumatoria = aux.getDato().getRaiz().getDato().getFrecuencia();
            
            while(aux2 != null){
                if(aux2.getDato().getRaiz().getDato().getCaracter().equals(aux.getDato().getRaiz().getDato().getCaracter()))
                    sumatoria += aux2.getDato().getRaiz().getDato().getFrecuencia();
                aux2 = aux2.getSiguiente();
            }
            
            Caracter cvacio ;
            NodoA narbol;
            
            if(!poli2.buscarCaracter(aux.getDato().getRaiz().getDato().getCaracter())){
                cvacio = new Caracter (aux.getDato().getRaiz().getDato().getCaracter(),sumatoria);
                narbol = new NodoA(cvacio);
                ArbolBinario a = new ArbolBinario();
                a.setRaiz(narbol);
                poli2.InsertarOrdenado(a);
            }
            
            aux = aux.getSiguiente();
        }
    }
    /**
     * Este es el metodo eliminarInicio el cual nos servira para eliminar el primer elemento de la cola y sera implementado en 
     * el metodo obtenerNodos() para ir eliminando los elementos de la cola e ir creando el arbol binario 
     * @return el nodo eliminado
     */
     public NodoA eliminarInicio () {
            
        Nodo  aux = cabecera;
        if (cabecera != null){
            cabecera = cabecera.getSiguiente();
            aux.setSiguiente(null);
            
        }
        return aux.getDato().getRaiz();
    }
     /**
      *  Este es el metodo get de la variable cabecera
      * @return cabecera
      */
    public Nodo getCabecera() {
        return cabecera;
    }
    /**
     *  Este es el metodo buscarCaracter() el cual verifica si el caracter ya se encuentra en la cola,
     * si es asi se le suma su frecuencia y si no se agrega el caracter a la cola
     * @param caracter
     * @return true si se encontro el caracter o false si no se encontro el caracter
     */
    public boolean buscarCaracter(Character caracter){
        Nodo aux = cabecera;
        while(aux!=null){
            if(aux.getDato().getRaiz().getDato().getCaracter().equals(caracter))
                return true;
            aux = aux.getSiguiente();
        }
        return false;
    }
    /**
     * Este es el metodo InsertarOrdenado el cual insertara un dato de tipo ArbolBinario de manera ordenada segun su frecuencia
     * @param dato 
     */
    public void InsertarOrdenado (ArbolBinario dato){
        Nodo nuevo = new Nodo(dato);
        if (cabecera == null){
            cabecera = nuevo;
        }else{
            Nodo aux = cabecera;
            Nodo ant = null;
            while (aux != null && aux.getDato().getRaiz().getDato().getFrecuencia() <= dato.getRaiz().getDato().getFrecuencia()){
                ant = aux;
                aux = aux.getSiguiente();
            }
            if(ant == null){
                nuevo.setSiguiente(cabecera);
                cabecera = nuevo;
            }else{
                ant.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
            }
        }

    }
    /**
     * Este es el metodo obtenerNodos() en el cual se van eliminando los primeros dos nodos de la cola, se crea otro nodo 
     * que contiene la suma de las frecuencias de esos nodos, y se crea un pequeño arbol, el cual sera insertado a la cola
     */
    public void obtenerNodos(){
                NodoA primerCaracter;
                NodoA segundoCaracter;
                Caracter vacio;
                NodoA arbol;
                ArbolBinario a;
		while(cabecera.getSiguiente()!=null){
			primerCaracter = eliminarInicio();
                        segundoCaracter = eliminarInicio();
                        vacio = new Caracter (null,primerCaracter.getDato().getFrecuencia()+segundoCaracter.getDato().getFrecuencia());
                        arbol = new NodoA(vacio,primerCaracter,segundoCaracter);
                        a = new ArbolBinario();
                        a.setRaiz(arbol); 
			InsertarOrdenado(a); 
		}
    }
     
    /**
     * Este es el metodo contarHojas() de tipo ListaTabla, en el cual se generarn los nuevos codigos binarios de cada caracter
     * y se guardan en una lista
     * @param ubicacion almacena el codigo del caracter 
     * @param ca almacena la lista con los codigos
     * @param raiz 
     * @return la lista con los codigos de cada caracter
     */
    public ListaTabla contarHojas(String ubicacion, ListaTabla ca, NodoA raiz){
        if(raiz != null ){
            if(raiz.getIzquierda()==null && raiz.getDerecha()==null){
                 ca.agregar(raiz.getDato().getCaracter() +  "", ubicacion);
            }else{
                 ca = contarHojas(ubicacion+"0", ca ,raiz.getIzquierda());
                 ca = contarHojas(ubicacion+"1", ca ,raiz.getDerecha());
            }
                
        }
        return ca;
    }
}