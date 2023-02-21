import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Countdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Countdown extends Actor
{
    /**
     * Act - do whatever the Countdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer;
    public Countdown(int time){
        this.timer=time*60;
        setImage(new GreenfootImage("Countdown:"+timer/60,30,Color.BLACK,new Color(0,0,0,0)));
    }
    public void act() 
    {
        timer--;
        setImage(new GreenfootImage("Countdown:"+timer/60,30,Color.BLACK,new Color(0,0,0,0)));
        if(timer<=0){
            getWorld().removeObject(this);
        }
        
    }    
}
