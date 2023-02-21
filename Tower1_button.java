import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower1_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower1_button extends Actor
{
    /**
     * Act - do whatever the Tower1_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    boolean clicked=false;
    public Tower1_button(){
        getImage().scale(60,60);
    }
    
    public void act() 
    {
        
    }
    public void goWithMouse(){
        int x=Greenfoot.getMouseInfo().getX();
        int y=Greenfoot.getMouseInfo().getY();
        setLocation(x, y);
    }
    
    public void addTower(){
        if(clicked){
            if(Greenfoot.mouseClicked(null)){
                world.addObject(new Tower(), (Greenfoot.getMouseInfo().getX()/60)*60+30, Greenfoot.getMouseInfo().getY()/60*60+30);
                world.money-=world.Tower1_price;
            }
        }
        
    }
}
