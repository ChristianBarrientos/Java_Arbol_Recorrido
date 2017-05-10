/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.util.Iterator;

/**
 *
 * @author fdg
 */
public interface ArbolBinario {
    
   //agregar elemento X
    public void add (Integer del, Integer ala, Integer valor);
    //Eliminar subarbol Izquierdo
    public void removeLeftSubtree();
    //Eliminar subarbol Derecho
    public void removeRightSubtree();
    //Eliminar todos los elementos del Arbol
    public void removeAllElements();
    //Determinar si el arbol se encuentra vacio
    public boolean isEmpty();
    //Devolver el tamaño del arbol
    public int size();
    // determina si el elemento X se encuentra en el arbol
    public boolean contains(int x);
    //Devueve referencia del elemento X si se encuentra
    public boolean find (int x);
    //Devuelve una representacio del arbol en forma de cadena de caracteres
    @Override
    public String toString();
    //Devuelve un iterator (java.util.Iterator) para el recorrido en arbol del arbol.
    public Iterator iteratorInOrden();
    //Devuelve un iterator (java.util.Iterator) para el recorrido descendente del arbol.
    public Iterator iteratorPreOrden();
    //Devuelve un iterator (java.util.Iterator) para el recorrido ascendente del arbol.
    public Iterator iteratorPostOrden();
}
