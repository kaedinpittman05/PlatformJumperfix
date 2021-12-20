import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class The_End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class The_End extends World
{

    /**
     * Constructor for objects of class The_End.
     * 
     */
    public The_End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new End(), 300,200);
    }
}
