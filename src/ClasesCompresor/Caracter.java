/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesCompresor;

/**
 * Esta es la clase Caracter la cual nos servira para que los nodos de la lista sean de tipo Caracter 
 * y de esta forma puedan sera manipulados al momento de crear el arbol
 * @author Ingrid Niño, Zuleyka Guzman
 */
public class Caracter {
    /**
     * Esta es la variable caracter la cual es de tipo Character
     */
   private Character caracter;
   /** 
    * Esta es la variable frecuencia que nos servira para almacenar la frecuencia del caracter
    */
   private Integer frecuencia;
   /**
    * Este es el constructor de la clase Caracter que le asigna a las variables caracter y frecuencia los valores
    * recibe como parametro
    * @param caracter
    * @param frecuencia 
    */
    public Caracter(Character caracter, Integer frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
    }
    /**
     * Este es el metodo get de la variable caracter
     * @return caracter 
     */
    public Character getCaracter() {
        return caracter;
    }
    /**
     * Este es el metodo get de la variable frecuencia
     * @return frecuencia
     */
    public Integer getFrecuencia() {
        return frecuencia;
    }
    /**
     * Este es el metodo set de la variable caracter
     * @param caracter 
     */
    public void setCaracter(Character caracter) {
        this.caracter = caracter;
    }
    /**
     * Este es el metodo set de la variable frecuencia
     * @param frecuencia 
     */
    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }
    /**
     * Este es el metodo toString de la clase Caracter en el cual se sobreescribe el metodo toString de la 
     * clase Object, y en este se imprimen los valores de caracter y frecuencia.
     * @return 
     */
    public String toString() {
        return caracter + " | frecuencia = " + frecuencia + "\n" ;
    }

    
}

