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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getXp method, of class Player.
     */
    @Test
    public void testGetXp() {
        System.out.println("getXp");
        int moreXp = 50;
        Player instance = new Player();
        instance.addXp(moreXp);
        int expected = instance.getXp();
        assertEquals(moreXp, expected);
    }

    /**
     * Test of addXp method, of class Player.
     */
    @Test
    public void testAddXp() {
        System.out.println("addXp");
        int moreXp = 50;
        Player instance = new Player();
        instance.addXp(moreXp);
        int expected = instance.getXp();
        assertEquals(moreXp, expected);
    }

    /**
     * Test of getXpToNextLevel method, of class Player.
     */
    @Test
    public void testGetXpToNextLevel() {
        System.out.println("getXpToNextLevel");
        int moreXp = 40;
        Player instance = new Player();
        instance.addXp(moreXp);         
        int expResult = 50;
        int result = instance.getXpToNextLevel();
        assertEquals(expResult, result);
    }
    
}
