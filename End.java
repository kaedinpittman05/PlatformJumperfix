import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Actor
{
    /**
     * Act - do whatever the End wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        theEnd();
    }
    
    /**
     * sets the image for the end screen
     */
    public void theEnd()
    {
        setImage("thanks_for_playing.jfif");
    }
}
