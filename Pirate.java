import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pirate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pirate extends Actor
{
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength= 13;
    private int remove = 0;
    
    
    
     public Pirate()
    {
        
    }
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        touchingEnemie();
        touchingBomb();
        
        water();
    }
    
    /**
     * Checks the user input to see where they move
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        } 
        
        if(Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
    }
    
    /**
     * makes the character move to the right
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    /**
     * makes the character move to the left
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    /**
     * makes the character fall when not on a platform
     */
    public void fall()
    {
        detectPlatform();
        setLocation (getX() , getY() + vSpeed);
        vSpeed += acceleration;
    }
    
    /**
     * stops the character from falling through the platform
     */
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Platform.class);
        
        return under != null;
    }
    
    /**
     * Checks to make sure the character is on the platform
     */
    public void detectPlatform()
    {
        for (int i= 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Platform.class);    
            if (under != null)
            {
                vSpeed = i;
            
            }
        }
    }
    
   
    /**
     * Checks to see if the character should fall
     */
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed=0;
        }
        else
        {
            fall();
        }
    }
    
    /**
     * makes the character jump
     */
    public void jump()
    {
        vSpeed= -jumpStrength;
        fall();
    }
    
    /**
     * Makes the character interact with the enemies
     */
    public void touchingEnemie()
    {
        if(isTouching(Crab.class)  && remove != 1)
        {
            setLocation(40,344);
        }
        else if(isTouching(Crab.class) && remove == 1)
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("Explosion.wav");
            remove--;
        }
        else if(isTouching(Fish.class) && remove != 1)
        {
            setLocation(40,344);
        }
        
        
    }
    
    /**
     * rests the character if they fall
     */
    public void water()
    {
        if(getY() >= getWorld().getHeight()-1)
        {
            setLocation(40,344);
        }
    }
    
    /**
     * makes it so they can kill the enemie
     */
    public void touchingBomb()
    {
        if(isTouching(Bomb.class))
        {
            removeTouching(Bomb.class);
            remove++;
        }
    }
    
    
    
    
}
