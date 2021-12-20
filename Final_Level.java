import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Final_Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final_Level extends World
{

    /**
     * Constructor for objects of class Final_Level.
     * 
     */
    public Final_Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        /**
     * Constructor for objects of class Final_Level.
     * 
     */
    
    
        setBackground("beach.jpg");
        
        
         
         
         
         Platform platform = new Platform();
         addObject(platform, 23,390);
         
         Platform platform1 = new Platform();
         addObject(platform1,70, 390);
         
         addObject(new Platform(), 152, 365);
         
         addObject(new Platform(), 229, 313);
         
         addObject(new Platform(), 308, 280);
         
         addObject(new Platform(), 394, 247);
         
         addObject(new Ship(), 538, 241);
        
        
        
        Pirate pirate = new Pirate();
         addObject(pirate, 40, 344);
    
    }
}
