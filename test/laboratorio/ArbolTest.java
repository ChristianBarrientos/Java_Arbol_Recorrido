/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fdg
 */
public class ArbolTest {
    Arbol tesa;
    public ArbolTest() {
    }
    
    @Before
    public void setUp() {
        tesa=new Arbol();
        tesa.add(100,tesa.getRaiz());
        tesa.add(200,tesa.getRaiz());
        tesa.add(300,tesa.getRaiz());
        tesa.add((400),tesa.getRaiz());
        tesa.add(700,tesa.getRaiz());
        tesa.add(50,tesa.getRaiz());
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of repetido method, of class Arbol.
     */
    @Test
    public void testRepetido() {
        int x=2;
        boolean valorEsperado=true;
        boolean resultado= tesa.repetido(x);
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of add method, of class Arbol.
     */
    @Test
    public void testAdd() {
        int c=20;
        int valorEsperado=7;
        tesa.add(c,tesa.getRaiz());
        int resultado=tesa.size();
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of removeLeftSubtree method, of class Arbol.
     */
    @Test
    public void testRemoveLeftSubtree() {
        tesa.removeLeftSubtree();
        int valorEsperado=5;
        int resultado=tesa.size();
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of removeRightSubtree method, of class Arbol.
     */
    @Test
    public void testRemoveRightSubtree() {
        tesa.removeRightSubtree();
        int valorEsperado=2;
        int resultado=tesa.size();
        
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of removeAllElements method, of class Arbol.
     */
    @Test
    public void testRemoveAllElements() {
        tesa.removeAllElements();
        int valorEsperado=0;
        int resultado=tesa.size();
       
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of isEmpty method, of class Arbol.
     */
    @Test
    public void testIsEmpty() {
        boolean resultado=tesa.isEmpty();
        boolean valorEsperado=false;
        
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of size method, of class Arbol.
     */
    @Test
    public void testSize() {
        int valorEsperado=6;
        int resultado=tesa.size();
       
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of contains method, of class Arbol.
     */
    @Test
    public void testContains() {
        int x=10;
        boolean resultado=tesa.contains(x);
        boolean valorEsperado=false;
        
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of find method, of class Arbol.
     */
    @Test
    public void testFind() {
        int x=50;
        boolean resultado=tesa.contains(x);
        boolean valorEsperado=true;
        
        assertEquals(resultado,valorEsperado);
    }

    /**
     * Test of toString method, of class Arbol.
     */
    @Test
    public void testToString() {
        String valorEsperado="10020030040070050";
        String resultado=tesa.toString();
        resultado.equals(valorEsperado);
    }

    /**
     * Test of getRaiz method, of class Arbol.
     */
   
    /**
     * Test of iteratorInOrden method, of class Arbol.
     */
    @Test
    public void testIteratorInOrden() {
    }

    /**
     * Test of iteratorPostOrden method, of class Arbol.
     */
    @Test
    public void testIteratorPostOrden() {
    }

    /**
     * Test of iteratorPreOrden method, of class Arbol.
     */
    @Test
    public void testIteratorPreOrden() {
    }

    /**
     * Test of iterator method, of class Arbol.
     */
    @Test
    public void testIterator() {
    }
    
}
