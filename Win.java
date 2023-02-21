import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Title title = new Title("You Win!!!",80,40);
        addObject(title,300,100);
        addObject(new Exit(),300,300);
        addObject(new Button2(),300,250);
    }
}
