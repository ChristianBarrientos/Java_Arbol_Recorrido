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
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Arbol a= new Arbol();
        System.out.println("---------------------------------Arbol 1---------------------------------------\n");
        a.add(5, null);
        a.add(6,a.getRaiz());
        a.add(4,a.getRaiz());
        a.add(2,a.getRaiz());
        a.add(1,a.getRaiz());
        a.add(8,a.getRaiz());
        //repetidos
        a.add(2,a.getRaiz());
        a.add(1,a.getRaiz());
        a.add(8,a.getRaiz());
        
        
        System.out.println("\nMetodo isEmpty:");
        if(!a.isEmpty())
        {
            System.out.println("");
            System.out.println("Metodo size:");
            System.out.println("Cantidad de Elementos del Arbol-->"+a.size());
            
            System.out.println("\nMetodo IteratorPostOrden:");
            System.out.print("Lista-->");
            Iterator<Nodo> iterPostOrden= a.iteratorPostOrden();
            while(iterPostOrden.hasNext())
            { }
            System.out.println("");
            System.out.println("\nMetodo IteratorPreOrden:");
            System.out.print("Lista-->");
            
            Iterator<Nodo> iterPreOrden= a.iteratorPreOrden();
            while(iterPreOrden.hasNext())
            { }
            System.out.println("");
            System.out.println("\nMetodo IteratorinOrden:");
            System.out.print("Lista-->");
            
            Iterator<Nodo> iterInOrden= a.iteratorInOrden();
            while(iterInOrden.hasNext())
            { }
            
            System.out.println("");
            System.out.println("\nMetodo contains:"); 
            a.contains(50);
            System.out.println();
            System.out.println("Metodo find:");
            a.find(8);
            System.out.println("");
            System.out.println("Metodo toString: ");
            System.out.println(a.toString());
            
            /*
            System.out.println("\nMetodo removeLefSubtree");
            a.removeLeftSubtree();
            System.out.print("Lista-->");
            for(Nodo x : a)
                {}*/
            System.out.println("\nMetodo removeRightSubtree:"); 
            a.removeRightSubtree();
            System.out.print("Lista-->");
            for(Nodo x : a)
                {}
            System.out.println("");
            System.out.println("\nMetodo size:");
            System.out.println("Nueva Cantidad de Elementos del Arbol-->"+a.size());
            
            System.out.println("\nMetodo removeAllElments:");
            a.removeAllElements();
            System.out.println("");
            System.out.print("Lista-->");
            for(Nodo x : a)
                 {}
            System.out.println("");
            
            
   
         }
        Arbol a2= new Arbol();
        System.out.println("\n---------------------------------Arbol 2---------------------------------------\n");
        a2.add(100,a2.getRaiz());
        a2.add(200,a2.getRaiz());
        a2.add(300,a2.getRaiz());
        a2.add((400),a2.getRaiz());
        a2.add(700,a2.getRaiz());
        a2.add(50,a2.getRaiz());
        
        a2.add(50,a2.getRaiz());
        a2.add(100,a2.getRaiz());
        
        System.out.println("\nMetodo isEmpty:");
        if(!a2.isEmpty())
        {
            System.out.println("");
            System.out.println("Metodo size:");
            System.out.println("Cantidad de Elementos del Arbol-->"+a2.size());
            
            System.out.println("\nMetodo IteratorPostOrden:");
            System.out.print("Lista-->");
            Iterator<Nodo> iterPostOrden= a2.iteratorPostOrden();
            while(iterPostOrden.hasNext())
            { }
            System.out.println("");
            System.out.println("\nMetodo IteratorPreOrden:");
            System.out.print("Lista-->");
            
            Iterator<Nodo> iterPreOrden= a2.iteratorPreOrden();
            while(iterPreOrden.hasNext())
            {
                Nodo tem= iterPreOrden.next();
                System.out.println("acacacacacacacacacacaca------>"+tem.getDato());
            }
            System.out.println("");
            System.out.println("\nMetodo IteratorinOrden:");
            System.out.print("Lista-->");
            
            Iterator<Nodo> iterInOrden= a2.iteratorInOrden();
            while(iterInOrden.hasNext())
            {
               
            }
            
            System.out.println("");
            System.out.println("\nMetodo contains:"); 
            a2.contains(500);
            System.out.println();
            System.out.println("Metodo find:");
            a2.find(100);
            System.out.println("");
            System.out.println("Metodo toString: ");
            System.out.println(a2.toString());
            
            System.out.println("\nMetodo removeLefSubtree");
            a2.removeLeftSubtree();  
            System.out.print("Lista-->");
            for(Nodo x : a)
                {}
            /*System.out.println("\nMetodo removeRightSubtree:"); 
            a2.removeRightSubtree();
            System.out.print("Lista-->");
            for(Nodo x : a)
                {}*/
            System.out.println("");
            System.out.println("Metodo size:");
            System.out.println("Nueva Cantidad de Elementos del Arbol-->"+a2.size());
            
            System.out.println("\nMetodo removeAllElments:");
            a2.removeAllElements();
            System.out.println("");
            System.out.print("Lista-->");
            for(Nodo x : a)
                 {}
            System.out.println("");
            
            System.out.println("\nMetodo isEmpty:");
            
            a.isEmpty();
            System.out.println("Metodo size:");
            System.out.println("Nueva Cantidad de Elementos del Arbol-->"+a2.size());
            //a2.contains(500);
            //a2.find(100);
            
           
   
         }
    }
}
