package consolegame;

/**
 *
 * @author Bruger
 */
public class Player extends Actor 
{
    protected int xp;
    private int xpToNextLvl = 50; // Starts at 50 for the first level transition from lvl 1 to 2.

    /**
     * Constructor for the player class. Sets the level to 1.
     */
    public Player()
    {
        level = 1;
    }       
    
    /**
     * Returns the players xp amount as an int
     * @return int: xp
     */
    public int getXp() 
    {
        return xp;
    }
    
    /**
     * Adds xp to the players xp amount. After it has been added it runs the private checkIfNewLevel() method, that 
     * levels the player up if it has reached the checkpoint for a new level.
     * @param moreXp: int
     */
    public void addXp(int moreXp) 
    {
        xp += moreXp;
        checkIfNewLevel();
    }
    
    /**
     * Gets the amount of xp required to raise to the players next level
     * @return int: xpToNextLvl
     */
    public int getXpToNextLevel() 
    {
        return xpToNextLvl;
    }
    
    // ------------
    // - Privates -
    // ------------    
    
    /**
     * Checks if the player is ready to proceed to the next level based on its xp amount. If the player is ready
     * its level is raised by one.
     */
    private void checkIfNewLevel() 
    {
        if(xpToNextLvl <= xp)
        {
            raiseStatsOneLvl();
        }        
    }
    
    /**
     * This method raises the other stats of the player coresponding its level.
     */
    private void raiseStatsOneLvl()
    {
        xpToNextLvl = 50;
        // Level raise
        level = level + 1;
        for(int lvl = 1; lvl < level; lvl++)
        {
            xpToNextLvl = xpToNextLvl * 2;
        }
        
        // Multiplier for increased stats raise
        double calculation = 1.5;
        double multiplier = calculation * level;  
        // HP raise
        health = (int) (40 * (int)multiplier);
        // Add new skills if at appropriate level
        switch(level)
        {
            case(3):
            case(6):        
            case(9):
                skills.add(getRandomSkill()); 
            break;
        }    
    } 
}
