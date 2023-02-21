import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower2 extends Actor
{
    int fireRate=0;
    Fire fire=new Fire();
    public Tower2(){
        getImage().scale(60,60);
        setRotation(90);
    }
    public void act() 
    {   
        fireRate++;
        if(fireRate==8){
            getWorld().addObject(fire, this.getX(), this.getY());
            Greenfoot.playSound("fire.wav");
        }
        
        if(fireRate==12){
            getWorld().removeObject(fire);
        }
        if(fireRate==20){
            fireRate=0;
        }
        
    } 
    
}
