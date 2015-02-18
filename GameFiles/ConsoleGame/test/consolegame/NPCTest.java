/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruger
 */
public class NPCTest {
    
    public NPCTest() {
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
     * Test of getXpGive method, of class NPC.
     */
    @Test
    public void testGetXpGive() {
        System.out.println("getXpGive");
        NPC instance = new NPC(2);
        int expResult = 30;
        int result = instance.getXpGive();
        assertEquals(expResult, result);
    }
    
}
