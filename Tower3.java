import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower3 extends Actor
{
    int fireRate=0;
    Ice ice=new Ice();
    public Tower3(){
        getImage().scale(60,60);
        setRotation(90);
    }
    public void act() 
    {   
        fireRate++;
        if(fireRate==8){
            getWorld().addObject(ice, this.getX(), this.getY());
        }
        
        if(fireRate==12){
            getWorld().removeObject(ice);
        }
        if(fireRate==20){
            fireRate=0;
        }
        
    } 
    
}
