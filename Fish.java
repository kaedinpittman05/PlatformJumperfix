import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int dX = 3;
    
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        reset();
    }
    
    /**
     * Makes the fish move
     */
    public void move()
    {
        setLocation(getX()-dX, getY());
    }
    
    /**
     * turns the fish around
     */
    public void reset()
    {
        if (getX() <= 0)
        {
            dX = -dX;
            setRotation(180);
        }
        else if (getX() >= 599)
        {
            dX= 3;
            setRotation(360);
        }
    }
}
