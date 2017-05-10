/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;



import java.util.Arrays;
import java.util.Iterator;


/**
 *
 * @author fdg
 */
public class Arbol extends Recorrido implements  Iterable<Nodo>,ArbolBinario {

    int posicion;
    String cadena;
    int salto=1;
    int cantidadElementos;
    public Nodo[] arbol;    
    private Nodo raiz;

    public Arbol(Integer x)
    {
        this.posicion=0;
        this.cantidadElementos=1;
        arbol= new Nodo[5];
        raiz=new Nodo(x);
        arbol[posicion]=raiz;
        arbol[posicion].setLado(0);  
        posicion++;
        
    }
    
     
    @Override
    public void add(Integer del, Integer ala, Integer valor) {
        
        Nodo aux= new Nodo(valor);
        
        if(cantidadElementos==arbol.length-1)
        {
            Nodo[] array2 = Arrays.copyOf(arbol, cantidadElementos*2);
            this.arbol=array2;
        }
        int aux_ala;

        if (salto <= 2) {
                    
                        arbol[posicion]=aux;
                        aux.setLado(ala);
                        aux.setDer(null);
                        aux.setIzq(null);
                        if(ala==1)
                            raiz.setDer(aux);
                        else
                            raiz.setIzq(aux);
                        
                        salto++;
                        posicion++;
                        cantidadElementos++;

                        } 
            
        else
        {
            for(int i=0;i<arbol.length;i++)
            {
                if(arbol[i].getDato()==aux.getDato())
                {
                    if(ala==1)
                    {
                        if(arbol[i].getDer()==null)
                        {
                            arbol[i].setDer(aux);
                        }
                        else
                            System.out.println("posicion ocupada");
                    }else{
                        if(arbol[i].getIzq()==null){
                            arbol[i].setIzq(aux);
                        }else
                        {
                            System.out.println("posicion ocupada");
                        }
                               
                              
                        
                    }
                }
            }
        }
            
               
             
            
            
            
                     
        
    }
    
    @Override
    public void removeLeftSubtree() {
        System.out.print("Eliminar el SubArbol IZQUIERDO de la Raiz");
        for(int i=0; i<arbol.length-2;i++)   
        {
            if(arbol[i].getLado().equals("IZQUIERDA"))
            {
                arbol[i].setDato(null);  
                cantidadElementos--;
            }
        }
    }

    @Override
    public void removeRightSubtree() {
       System.out.println("Eliminar el SubArbol DERECHO de la Raiz");
       for(int i=0; i<arbol.length-2;i++)  
        {
            if(arbol[i]!=null)
            {
                if(arbol[i].getLado().equals("DERECHA"))
                {
                    arbol[i].setDato(null);  
                    cantidadElementos--;
                }
            }
            
        }
    }

    @Override
    public void removeAllElements() {
        System.out.print("Eliminar Todos Los Elementos del Arbol");
        cantidadElementos=0;
        raiz.setDato(null);
        
    }

    @Override
    public boolean isEmpty() {
        if(cantidadElementos==0)
        {
            System.out.println("La Lista SI Se Encuentra Vacia");
            return true;
        }
        else
        {
             System.out.println("La Lista NO Se Encuentra Vacia");
             return false;
        }
    }

    @Override
    public int size() {
        return cantidadElementos;
    }
    
    @Override
    public boolean contains(int x) {
        
       //se fija si se encuentra x en la lista
        boolean encontro=false;
        for(int i=0;i<arbol.length-2;i++)
        {
            if(arbol[i]!=null)
            {
                if(this.arbol[i].getDato()==x)
                 encontro=true;
                else
                    encontro=false;
            }
              
        }
        if(encontro)
        {
            System.out.println("El elemento: "+x+" SI se encuentra en el arbol");
            return encontro;
        }
            
        else
            {
                System.out.println("El elemento:"+x+" NO se encuentra en el arbol");
                return encontro;
            }
            
    }

    @Override
    public boolean find(int x) {
        //se fija si se encuentra x en la lista y le devuelve informacion osbre el mismo
       boolean encontro=false;
       for(int i=0;i<this.arbol.length-2;i++)
       {
           //System.out.println(this.arbol[i].getDato());
           if(this.arbol[i]!=null)
           {
               //System.out.println(this.arbol[i].getDato());
                if(this.arbol[i].getDato()==x)
                {
                     System.out.println("El elemento: "+x+"\nSe encuentra en el lado: "+this.arbol[i].getLado()+" del Arbol Binario.\nPosee la posicion: "+i+" de la Lista enlazada.");
                     encontro=true;
                }
                else
                    encontro=false;
           }
          
       }
       return encontro;
    }
    
    @Override
    public String toString()
    {
        String cadena=" ";
        for(int i=0;i<arbol.length-2;i++)
        {
            if(arbol[i]!=null)
                cadena= cadena + String.valueOf(arbol[i].getDato());
            
        }
        return cadena;
        /*String x= String.valueOf(arbol);
        
        return x;*/
    }
    
    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }
    /**
     * @param raiz the raiz to set
     */
    
    
    @Override
    public Iterator iteratorInOrden() {
        Iterator it;
        it= new IteratorinOrden();
        return it;
    }

    

    @Override
    public Iterator iteratorPostOrden() {
        
        Iterator it;
        it= new IteratorPostOrden(){
            
        };
        return it;
    
    }
    @Override
    public Iterator iteratorPreOrden() {
        
        Iterator it;
        it= new IteratorPreOrden(){
            
        };
        return it;
        
    }
    

 @Override
    public Iterator<Nodo> iterator() {
        Iterator it;
        it= new IteratorPreOrden(){
            
        };
        return it;
        
      
    }

    
   
    
    //Clases para los iteradores
    
    //PREORDEN
    protected class IteratorPreOrden implements Iterator <Nodo>
    {
        Integer[] arraysi= new Integer [100];
        int tesc=0;
        protected int posicion=0;
        
        int salto=0;

        @Override
        public boolean hasNext() {
           
            boolean res;
             if(posicion<cantidadElementos )
             {
                 if(salto==0)
                 {
                    salto++;
                    arraysi=preOrden(arbol[posicion]);
                    
                 }
             }
           
         return res=false; 
        }
       
        @Override
        public Nodo next() {
            posicion++;
            
            
            return arbol[posicion-1];
        }
        @Override
        public void remove()
        {
            throw new UnsupportedOperationException("No soportado.");
        }  
    } 
    
     //INORDEN
     protected class IteratorinOrden implements Iterator <Nodo>
    {
        protected int posicion=0;
        
        int salto=0;

        @Override
        public boolean hasNext() {
           
            boolean res;
             if(posicion<cantidadElementos )
             {
                 if(salto==0)
                 {
                     salto++;
                     return inOrden(arbol[posicion]);
                 }
             }
          
         return res=false; 
        }
        @Override
        public Nodo next() {
            posicion++;
            return arbol[posicion-1];
        }
        @Override
        public void remove()
        {
            throw new UnsupportedOperationException("No soportado.");
        }  
    } 
     
     ////POSTORDEN
      protected class IteratorPostOrden implements Iterator <Nodo>
    {
        protected int posicion=0;
        
        int salto=0;

        @Override
        public boolean hasNext() {
           
            boolean res;
             if(posicion<cantidadElementos )
             {
                 if(salto==0)
                 {
                     salto++;
                     return postOrden(arbol[posicion]);
                 }
             }
            
         return res=false; 
        }
        @Override
        public Nodo next() {
            posicion++;
            return arbol[posicion-1];
        }
        @Override
        public void remove()
        {
            throw new UnsupportedOperationException("No soportado.");
        }  
    } 
     
     
}
