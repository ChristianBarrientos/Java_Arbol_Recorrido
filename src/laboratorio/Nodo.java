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
public class Nodo {
    
    private Integer lado;
    private Integer dato;
    private Nodo izq;
    private Nodo der;
    
    public Nodo (Integer dato)
    {
        this.dato=dato;
        this.izq=null;
        this.der=null;
        
    }

    /**
     * @return the dato
     */
    public Integer getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Integer dato) {
        this.dato = dato;
    }

    /**
     * @return the izq
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public Nodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     * @return the lado
     */
    public Integer getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(Integer lado) {
        this.lado = lado;
    }
    
    
}
