import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shiggins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shiggins extends Goal
{
    private GifImage gifImage = new GifImage("Shiggins.gif");
    private int goal = 0;
    private int start = 0;
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(gifImage.getCurrentImage());
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
     * moves the player to the next level
     */
    public void newWorld()
    {
        if(goal == 1 && start == 1)
        {
            Greenfoot.setWorld(new The_End());
            
        }
        
    }
}
