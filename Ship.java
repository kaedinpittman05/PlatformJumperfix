import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Goal
{
    private int goal = 0;
    private int start = 0;
    
    /**
     * Act - do whatever the Keg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        goalCheck();
    }
    
    /**
     * checks to see if the player is touching the goal
     */
    public void goalCheck()
    {
        if(isTouching(Pirate.class))
        {
            goal++;
            start++;
            newWorld();
        }
    }
    
    /**
     * ends the game
     */
    public void newWorld()
    {
        if(goal == 1 && start == 1)
        {
            Greenfoot.setWorld(new The_End());
            
        }
    }
}
