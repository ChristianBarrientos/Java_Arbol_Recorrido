/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;



/**
 *
 * @author fdg
 */
public abstract class Recorrido  {
    
    Integer [] si;
    
    public Integer[] preOrden(Nodo raiz)
        {
            boolean res;
            si= new Integer[100];
            int cont=0;
            if(raiz!=null)
            {
                 if(raiz.getDato()!=null)
                {
                     System.out.print(raiz.getDato()+" - ");
                     si[cont]=raiz.getDato();
                     //System.out.println("a"+si[cont]);
                     cont++;
                }
               
                preOrden(raiz.getIzq());
                preOrden(raiz.getDer());
            }
            return si;
            //return res=true;
        }
    
    public boolean inOrden(Nodo raiz)
        {
            boolean res;
            if(raiz!=null)
            {
                inOrden(raiz.getIzq());
                if(raiz.getDato()!=null)
                {
                    System.out.print(raiz.getDato()+" - ");
                }
                
                inOrden(raiz.getDer());
            }
            return res=true;
        }
    
    public boolean postOrden(Nodo raiz)
        {
            boolean res;
            
            if(raiz!=null)
            {
                postOrden(raiz.getIzq());
                postOrden(raiz.getDer());
                if(raiz.getDato()!=null)
                {
                    System.out.print(raiz.getDato()+" - "); 
                }
               
            }
            return res=true;
        }
    
}
