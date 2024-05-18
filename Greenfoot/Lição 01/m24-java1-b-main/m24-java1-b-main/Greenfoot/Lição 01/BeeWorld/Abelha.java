import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(10);
        }
        if(isTouching(Aranha.class)){
        getWorld().showText("Ah nãooooo", 100, 300);
        }
        
    }
}
