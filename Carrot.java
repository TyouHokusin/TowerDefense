import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrot extends Actor
{
    public int hp=10;
    public Carrot(){
        getImage().scale(60,60);
    }
    
    public void act() 
    {
        eaten();
        gameover();
    }
    
    public void eaten(){
        Actor enemy=getOneIntersectingObject(Enemy.class);
        if(enemy!=null){
            getWorld().removeObject(enemy);
            hp-=1;
        }
        Actor boss1=getOneIntersectingObject(Boss1.class);
        if(boss1!=null){
            getWorld().removeObject(enemy);
            hp-=10;
        }
    }
    public void gameover(){
        if(hp<=0){
            getWorld().showText("Game Over!", 360,260);
            
            Greenfoot.delay(100);
            Greenfoot.setWorld(new Gameover());
        }
    }
}
