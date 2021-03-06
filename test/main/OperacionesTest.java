
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class OperacionesTest {
    
    private static Operaciones operaciones;
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //Objeto de prueba
        operaciones = new Operaciones();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Tests of rango method, of class Operaciones.
     */
    // A Menor Que B.
    
    @Test
    public void testRangoAMenorQueB() {
        
        int a = 2;
        int b = 8;
        
        int[] expResult = {2,3,4,5,6,7,8};
        
        int[] result = operaciones.rango(a, b);
        
        assertArrayEquals(expResult, result);
    }
    
    // A Mayor Que B.
    
    @Test
    public void testRangoAMayorQueB() {
     
        int a = 8, b = 2;
        
        int[] expResult = {2,3,4,5,6,7,8};
        
        int[] result = operaciones.rango(a, b);
        
        assertArrayEquals(expResult, result);
    }   

    /**
     * Tests of sumRango method, of class Operaciones.
     */
    // A Menor Que B
    
    @Test
    public void testSumRangoAMenorQueB() {
        
        int a = 3;
        int b = 8;
        
        int expResult = 33;
        
        int result = operaciones.sumRango(a, b);
        
        assertEquals(expResult, result);
        
    }
    // A Mayor Que B
   
    @Test
    public void testSumRangoAMayorQueB() {
        
        int a = 8, b = 3;
        
        int expResult = 33;
        
        int result = operaciones.sumRango(a, b);
        
        assertEquals(expResult, result);
    }
    

    /**
     * Tests of isPar method, of class Operaciones.
     */
    // a es un número par.
    
    @Test
    public void testIsPar() {
        
        int a = 8;
        
        boolean expResult = true;
        
        boolean result = operaciones.isPar(a);
        
        assertEquals(expResult, result);   
    }
    // a es un número impar.
    
    @Test
    public void testIsImpar() {
        
        int a = 5;
        
        boolean expResult = false;
        
        boolean result = operaciones.isPar(a);
        
        assertEquals(expResult, result);
    } 
    // a es 0.
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsParAEs0() throws IllegalArgumentException{
        
        int a = 0;
        
        boolean result = operaciones.isPar(a);
    }
    // a es un número negativo.

    @Test(expected = IllegalArgumentException.class)
    public void testIsParAEsNegativo() {
        
        int a = -8;
        
        boolean result = operaciones.isPar(a);
    }
    
    
    /**
     * Tests of extraerPositivos method, of class Operaciones.
     */
    // el array no es nulo.
    
    @Test
    public void testExtraerPositivos() {
        
        int[] nums = {-3,2,8,4,6,-9,-10,-7,100};
        
        int[] expResult = {2,8,4,6,100};
        
        int[] result = operaciones.extraerPositivos(nums);
        
        assertArrayEquals(expResult, result);
        
    }
    
    //El array es nulo.
    
    @Test(expected = IllegalArgumentException.class)
    public void testExtraerPositivosNull() {
        
        int[] nums = null;
        
        int[] result = operaciones.extraerPositivos(nums);       
    }
    
    //El array esta vacio.
    
    @Test
    public void testExtraerPositivosVacio(){
        
        int[] nums = new int[0];
        
        int[] expResult = {};
        
        int[] result = operaciones.extraerPositivos(nums);
        
        assertArrayEquals(expResult, result);
    }
}
