import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends Actor
{
    /**
     * Act - do whatever the Money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Money(int money){
        setImage(new GreenfootImage("$"+money,30,Color.BLACK,new Color(0,0,0,0)));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
