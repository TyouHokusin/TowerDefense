import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fire(){
        GreenfootImage image=new GreenfootImage(200,200);
        image.setColor(Color.RED);
        image.drawOval(0, 0, 200, 200);
        this.setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
