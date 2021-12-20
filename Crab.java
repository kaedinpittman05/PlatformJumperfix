import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private int dX = 2;
    private int turn = 0;
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn++;
        checkMove();
        
    }
    
    /**
     * Checks to see if the crab is on the platform
     */
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Platform.class);
        
        return under != null;
    }
    
    /**
     * Checks where the crab is and makes it move
     */
    public void checkMove()
    {
        if(onGround() && turn < 100 )
        {
            setLocation(getX()+dX, getY());
        }
        else
        {
            dX= -dX;
            turn=0;
            
        }
        
      
        
        
        
    }
    
    
}
