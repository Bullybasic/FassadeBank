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
public class HypothekTest {
    
    public HypothekTest() {
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
     * Test of IstGeeignet method, of class Hypothek.
     */
    @Test
    public void testIstGeeignet() {
        System.out.println("IstGeeignet");
        Kunde k = new Kunde("Peter");
        int betrag = 80;
        Hypothek instance = new Hypothek();
        boolean expResult = false;
        boolean result = instance.IstGeeignet(k, betrag);
        assertEquals(expResult, result);
        
        
    }
    
}
