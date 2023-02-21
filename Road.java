import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
    public int turn;
    public boolean straight=true;
    public Road(boolean straight){
        this.straight=straight;
        getImage().scale(60,60);
    }
    public Road(int turn){
        getImage().scale(60,60);
        this.straight=false;
        this.turn=turn;
    }
        
    public void act() 
    {
        // Add your action code here.
    }    
}
