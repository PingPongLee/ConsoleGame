package consolegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ren� & Daniel
 */
public class NPC extends Actor 
{
    protected int xpGive;
    private double calculation = 1.5;
    private String[] names = { "Jens" , "Erik" , "Binger" , "Ping" , "Pong" , "Lee" };
    
    /**
     * NPC constructor that gives it its health, xpGive and skills based on what level it is provided.
     * @param level: lvl
     */
    public NPC(int lvl)
    {
        double multiplier = calculation * lvl;
        
        // Random name
        int idx = new Random().nextInt(names.length);
        name = (names[idx]);   
        
        // Calculate health
        health = (int) (10 * (int)multiplier);
        
        //Level calc
        level = lvl;
        
        // Skills
        int numberOfSkills = 0;
        if(level <= 3)
        {
            numberOfSkills = 1;
        }
        else if((level <= 6) && (level > 4))
        {
            numberOfSkills = 2;
        }
        else
        {
            numberOfSkills = 3;    
        }
        
        for(int i = 0; i < numberOfSkills; i++)
        {            
            skills.add(getRandomSkill());
        }        
        
        //xpGive calculation
        xpGive = (int) (10 * (int)multiplier);        
    }

    /**
     * Gets the xp value the NPC is dropping upon getting killed.
     * @return xpGive: int
     */
    public int getXpGive() 
    {
        return xpGive;
    }              
}
