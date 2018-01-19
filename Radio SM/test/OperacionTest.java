/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mafer
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    

   

    

    /**
     * Test of siguiente method, of class Operacion.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a = 0.0F;
        Operacion instance = new Operacion();
        float expResult = 0.0F;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anterior method, of class Operacion.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = 0.0F;
        Operacion instance = new Operacion();
        float expResult = 0.0F;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Operacion.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 530;
        int b = 0;
        Operacion instance = new Operacion();
        instance.guardar(530, 9);
        
    }

    /**
     * Test of seleccionarFav method, of class Operacion.
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("seleccionarFav");
        int b = 0;
        Operacion instance = new Operacion();
        float expResult = 0.0F;
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onOff method, of class Operacion.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        Operacion instance = new Operacion();
        instance.onOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Switch method, of class Operacion.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        Operacion instance = new Operacion();
        float expResult = 0.0F;
        float result = instance.Switch();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
