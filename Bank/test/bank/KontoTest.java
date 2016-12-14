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
public class KontoTest {
    
    public KontoTest() {
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
     * Test of HatGenugGuthaben method, of class Konto.
     */
    @Test
    public void testHatGenugGuthaben() {
        System.out.println("HatGenugGuthaben");
        Kunde k = new Kunde("Marino");
        int betrag = 5;
        Konto instance = new Konto(0);
        boolean expResult = false;
        boolean result = instance.HatGenugGuthaben(k, betrag);
        assertEquals(expResult, result);
    }
    
}
