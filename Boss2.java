import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.lang.System;
/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Boss2 extends Actor
{
    int speed=1;
    MyWorld myworld;
    public int health=5000;
    public Boss2(){
        setImage("lemur.png");
        getImage().scale(120,120);
    }
    
    public void hitByBullet(){
        Actor bullet=getOneIntersectingObject(Bullet.class);
        if(bullet!=null){
            getWorld().removeObject(bullet);
            health-=30;
        }
        
    }
    
    public void die(){
        if(health<=0){
            myworld.money+=10000;
            getWorld().removeObject(this);
            win();
        }
        
    }
    
    public void win(){
        getWorld().showText("You Win!", 360,260);
            
        Greenfoot.delay(100);
        Greenfoot.setWorld(new Win());
    }
    
    public void hitByFire(){
        List<Fire> fires=getObjectsInRange(100, Fire.class);
        for(Fire fire:fires){
            health-=10;
        }
    }
    
    public void hitByIce(){
        List<Tower3> tower3s=getObjectsInRange(100, Tower3.class);
        if(tower3s.isEmpty()){
            speed=1;
            setImage("lemur.png");
            getImage().scale(120,120);
        }
        else{
            speed=1;
            setImage("lemur.png");
            getImage().scale(120,120);
            for(Tower3 tower3:tower3s){
                health-=1;
                
            }
        }
    }
    
    public void moveAlongPath(){
        move(speed);
        List<Road> road90=getObjectsAtOffset(-30,0, Road.class);
        for(Road roads:road90){
            if(roads.straight==false&&getRotation()==0)
            {
                setRotation(roads.turn);
            }
        }
        List<Road> road0=getObjectsAtOffset(0,-30, Road.class);
        for(Road roads:road0){
            if(roads.straight==false&&getRotation()==90)
            {
                setRotation(roads.turn);
            }
        }
        List<Road> road180=getObjectsAtOffset(0,30, Road.class);
        for(Road roads:road180){
            if(roads.straight==false&&getRotation()==270)
            {
                setRotation(roads.turn);
            }
        }
        List<Road> road270=getObjectsAtOffset(30,0, Road.class);
        for(Road roads:road270){
            if(roads.straight==false&&getRotation()==180)
            {
                setRotation(roads.turn);
                //System.out.println("up!");
            }
        }
    }
    public void act() 
    {
        moveAlongPath();
        hitByBullet();
        hitByFire();
        hitByIce();
        die();
    }   
    
}
