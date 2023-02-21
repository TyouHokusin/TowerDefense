import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Exit(){
        setImage(new GreenfootImage("Exit",30,Color.RED,new Color(0,255,0,0)));
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            System.exit(0);
        }
    }    
}
