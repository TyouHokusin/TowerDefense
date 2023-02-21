import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends Actor
{
    /**
     * Act - do whatever the Ice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ice(){
        GreenfootImage image=new GreenfootImage(200,200);
        image.setColor(Color.BLUE);
        image.drawOval(0, 0, 200, 200);
        this.setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
