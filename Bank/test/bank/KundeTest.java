/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marino
 */
public class KundeTest {
    
    public KundeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getName method, of class Kunde.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Kunde instance = new Kunde("s");
        String expResult = "s";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}
