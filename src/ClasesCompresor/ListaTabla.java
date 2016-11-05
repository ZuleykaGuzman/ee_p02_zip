package ClasesCompresor;
    /**
    * Esta es la clase ListaTabla la cual nos ayuda a sacar los nuevos codigos binarios de cada caracter,
    * los cuales se guardan en una lista 
    * @author Ingrid Niño, Zuleyka Guzman
    */
    public class ListaTabla {
        /**
         * Esta es la variable inicio de tipo NodoListaT
         * que indica el inicio de la lista
         */
	private NodoListaT inicio;
        /**
         * Este es el constructor de la clase el cual inicializa la variable inicio en null
         */
	public ListaTabla(){
            inicio=null;
	}
        /**
         * Este es el metodo get de la variable inicio
         * @return inicio
         */
	public NodoListaT getInicio() {
		return inicio;
	}
        /**
         * Este es el metodo set de la variable inicio
         * @param inicio 
         */
	public void setInicio(NodoListaT inicio) {
		this.inicio = inicio;
	}
        /**
         * Este es el metodo vaciarLista() el cual nos servira para vaciar la lista 
         */
        public void vaciarLista(){
            inicio = null;
        }
	/**
         * Este es el metodo agregar() el cual sirve para agregar un nodo a la lista 
         * @param valor
         * @param ubicacion 
         */
	public void agregar(String valor,String ubicacion){
		NodoListaT nuevo = new NodoListaT(valor,ubicacion);
		if(this.getInicio() == null)
			this.setInicio(nuevo);
		else{
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}
        /**
         * Este es el metodo acarInicio() el cual recorre la lista y regresa el inicio de la misma
         * @return aux
         */
	public NodoListaT sacarInicio(){
            NodoListaT aux=inicio;
		if(aux!=null){
		inicio=aux.getSiguiente();
		aux.setSiguiente(null);
                }
                return aux;
	}
	/**
         * Este es el metodo imprimir() el cual recorre la lista e imprime el codigo de los caracter y
         * el caracter al que corresponden separados por un guion
         * @return s que es la impresion de la lista 
         */
	public String imprimir(){
            String s = "";
		if(this.getInicio()!=null){
			NodoListaT aux=inicio;
			while(aux!=null){
				s += aux.getUbicacion()+"-"+ aux.getDato2();
				aux=aux.getSiguiente();
			}
		}
                return s;
	}
	/**
         * 
         * @param mensaje
         * @return cadena
         */
	public String unirTodo(String mensaje){
            String cadena="";
		if(getInicio()!=null){
		for(int i=0;i<mensaje.length();i++){
			cadena += buscarCaracter(mensaje.charAt(i)+"");
                }
                }
		return cadena;
	}
        /**
         * Este es el metodo buscarCaracter() el cual recorre la lista  para buscar el caracter
         * que se le pasa como parametro y regresar el codigo del mismo.
         * @param caracter
         * @return el codigo del caracter
         */
        public String buscarCaracter(String caracter){
        NodoListaT aux = inicio;
        while(aux!=null){
            if(aux.getDato2().equals(caracter)) 
                return aux.getUbicacion();
            aux = aux.getSiguiente();
        }
            return null;
        }
	/**
         * Este es el metodo letraDe() el cual sirve para saber cual es el caracter que corresponde al codigo
         * que se le pasa como parametro a este metodo, esto se puede hacer recorriendo la lista.
         * @param ubicacion que es el codigo del caracter 
         * @return la letra o caracter correspondiente al codigo 
         */
	public String letraDe(String ubicacion){
		String letra=null;
		NodoListaT aux=inicio;
		while(aux!=null && !(aux.getUbicacion().equals(ubicacion))){
			aux=aux.getSiguiente();
		}
		if(aux!=null)
			letra=aux.getDato2()+"";
		return letra;
	}
}
