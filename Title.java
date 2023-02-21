import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Title(String text,int x,int y){
        GreenfootImage img = new GreenfootImage(300, 100);
        img.setColor(Color.WHITE);
        img.fill();
        img.setColor(Color.RED);
        img.setFont(new Font("OptimusPrinceps", false, false , 30));
        img.drawString(text, x, y);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
