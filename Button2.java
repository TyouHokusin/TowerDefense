import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button2 extends Actor
{
    /**
     * Act - do whatever the Button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button2() 
    {
        setImage(new GreenfootImage("Title",30,Color.RED,new Color(0,255,0,0)));
    }    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Starting_menu());
        }
    }
}
