/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolegame;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
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
public class MapLevelTest {
    
    MapLevel map = new MapLevel();
    String applicationDir = getClass().getProtectionDomain().getCodeSource().getLocation().getPath().replace("%20", " ");
    
    public MapLevelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {        
        if (applicationDir.contains(".")) {
            applicationDir = applicationDir.substring(0,applicationDir.lastIndexOf('/'));
        }
        applicationDir += "/levels/map1.txt"; 
        map.loadMap(applicationDir);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadMap method, of class MapLevel.
     */
    @Test
    public void testLoadMap() {
        assertNotNull(map.getMap());
    }

    /**
     * Test of getStartPosition method, of class MapLevel.
     */
    @Test
    public void testGetStartPosition() {
        System.out.println("getStartPosition");
        Point expResult = new Point(2,4);
        Point result = map.getStartPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNpcs method, of class MapLevel.
     */
    @Test
    public void testGetNpcs() {
        System.out.println("getNpcs");
        int numberOfNPCs = map.getNpcs().size();
        int expectedNumberOfNPCs = 13;
        assertEquals(expectedNumberOfNPCs, numberOfNPCs);
    }

    /**
     * Test of killNpc method, of class MapLevel.
     */
    @Test
    public void testKillNpc() {
        System.out.println("killNpc");        
        List<NPC> npcs = map.getNpcs();
        NPC npc = npcs.get(0);
        map.killNpc(npc);
        int numberOfNPCs = map.getNpcs().size();
        int expectedNumberOfNPCs = 12;
        assertEquals(expectedNumberOfNPCs, numberOfNPCs);  
    }
    
}
