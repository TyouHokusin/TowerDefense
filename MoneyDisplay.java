import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyDisplay extends Actor
{
    /**
     * Act - do whatever the Money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld myworld;
    public MoneyDisplay(){
        setImage(new GreenfootImage("Money:$"+myworld.money,30,Color.BLACK,new Color(0,0,0,0)));
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Money:$"+myworld.money,30,Color.BLACK,new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            myworld.money=100;
        }
    }    
}
