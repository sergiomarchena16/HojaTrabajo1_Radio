/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Mafer
 */
public class OperacionTest {
    
    public OperacionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     * Test of siguiente method, of class Operacion.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a = (float) 540;
        Operacion instance = new Operacion();
        float expResult = 550;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       if (expResult != result) {
        fail("The test case is a prototype.");
       }
       a = (float) 94.9;
       expResult = (float) 95.1;
       result = instance.siguiente(a);
       assertEquals(expResult, result, 0.0);
       // TODO review the generated test code and remove the default call to fail.
       if (expResult != result) {
        fail("The test case is a prototype.");
       }
    }

    /**
     * Test of anterior method, of class Operacion.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = (float) 94.9;
        Operacion instance = new Operacion();
        float expResult = (float) 94.7;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
        fail("The test case is a prototype.");
       }
        a = 630;
        expResult = (float) 620;
        result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
        fail("The test case is a prototype.");
       }
    }

    /**
     * Test of guardar method, of class Operacion.
     */
//    @Test
//    public void testGuardar() {
//        System.out.println("guardar");
//        float e = (float) 102.9;
//        int b =  2;
//        Operacion instance = new Operacion();
//        instance.guardar(1029, 2);
//        
//    }

    /**
     * Test of seleccionarFav method, of class Operacion.
     */
//    @Test
//    public void testSeleccionarFav() {
//        System.out.println("seleccionarFav");
//        int b = 0;
//        Operacion instance = new Operacion();
//        float expResult = 0.0F;
//        float result = instance.seleccionarFav(b);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of onOff method, of class Operacion.
     */

/*    @Test
    public void testOnOff() {
        System.out.println("onOff");
        Operacion instance = new Operacion();
        instance.onOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    /**
     * Test of Switch method, of class Operacion.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        Operacion instance = new Operacion();
        float expResult = (float) 87.9;
        float result = instance.Switch();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
        fail("The test case is a prototype.");
        }
        
        expResult = (float) 530;
        result = instance.Switch();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result) {
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setAM method, of class Operacion.
     */
//    @Test
//    public void testSetAM() {
//        System.out.println("setAM");
//        String a = "";
//        Operacion instance = new Operacion();
//        instance.setAM(a);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setFM method, of class Operacion.
     */
//    @Test
//    public void testSetFM() {
//        System.out.println("setFM");
//        String a = "";
//        Operacion instance = new Operacion();
//        instance.setFM(a);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of onOff method, of class Operacion.
     */
//    @Test
//    public void testOnOff() {
//        System.out.println("onOff");
//        Operacion instance = new Operacion();
//        instance.onOff();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
