/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolegame;

import java.awt.Point;
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
public class ActorTest {
    
    public ActorTest() {
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
     * Test of getPosition method, of class Actor.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Actor instance = new Actor();
        Point expResult = null;
        Point result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHealth method, of class Actor.
     */
    @Test
    public void testGetHealth() {
        System.out.println("getHealth");
        int hp = 100;
        Player p = new Player();
        p.health = hp;
        int expResult = hp;
        int result = p.getHealth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLevel method, of class Actor.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        Actor instance = new Actor();
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Actor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Actor instance = new Actor();
        String expResult = "Jahallo";       
        instance.name = expResult;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSkills method, of class Actor.
     */
    @Test
    public void testGetSkills() {
        System.out.println("getSkills");
        Actor instance = new Actor();
        
        SkillSlap slap = new SkillSlap();
        List<Skill> skillsList = new ArrayList<Skill>(); 
        skillsList.add(slap);
        instance.setSkills(skillsList);
        
        List<Skill> expResult = skillsList;
        List<Skill> result = instance.getSkills();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPosition method, of class Actor.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point position = null;
        Actor instance = new Actor();
        instance.setPosition(position);
    }

    /**
     * Test of setHealth method, of class Actor.
     */
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");
        int health = 0;
        Actor instance = new Actor();
        instance.setHealth(health);
    }

    /**
     * Test of setLevel method, of class Actor.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 0;
        Actor instance = new Actor();
        instance.setLevel(level);
    }

    /**
     * Test of setName method, of class Actor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Actor instance = new Actor();
        instance.setName(name);
    }

    /**
     * Test of setSkills method, of class Actor.
     */
    @Test
    public void testSetSkills() {
        System.out.println("setSkills");
        List<Skill> skills = null;
        Actor instance = new Actor();
        instance.setSkills(skills);
    }

    /**
     * Test of getSkillDamage method, of class Actor.
     */
    @Test
    public void testGetSkillDamage() {
        System.out.println("getSkillDamage");
        int skill = 0;
        Actor instance = new Actor();
        SkillSlap slap = new SkillSlap();
        List<Skill> skillsList = new ArrayList<Skill>(); 
        skillsList.add(slap);
        instance.setSkills(skillsList);
        double expResult = 10.0;
        double result = instance.getSkillDamage(skill);
        assertEquals(expResult, result, 1.0f);
    }
   
}
