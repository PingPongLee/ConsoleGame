/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolegame;

import java.util.ArrayList;
import java.util.List;
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
public class CombatTest {
    
    public CombatTest() {
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
     * Test of doCombat method, of class Combat.
     */
    @Test
    public void testDoCombat() {
        System.out.println("doCombat");
        Player player = new Player();
        NPC npc = new NPC(1);
        List<Skill> skills = new ArrayList<Skill>();
        skills.add(new SkillSlap());
        npc.setSkills(skills);
        player.setSkills(skills);
        Combat instance = new Combat(player, npc);
        for (int i = 0; i < 10; i++) {
            System.setIn(new java.io.ByteArrayInputStream("1\n".getBytes()));
        }
        boolean expResult = true;
        boolean result = instance.doCombat();
        assertEquals(expResult, result);
       
    }
    
}
