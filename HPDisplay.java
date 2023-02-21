import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPDisplay extends Actor
{
    MyWorld world;
    int hp;
    public HPDisplay(int hp){
        this.hp=hp;
        setImage(new GreenfootImage("HP:"+this.hp,30,Color.BLACK,new Color(0,0,0,0)));
    }
    
    public void act() 
    {
        
        if(hp>=5){
            setImage(new GreenfootImage("HP:"+hp,30,Color.BLACK,new Color(0,0,0,0)));
        }
        else{
            setImage(new GreenfootImage("HP:"+hp,30,Color.RED,new Color(0,255,0,0)));
        }
    }
    public void update(int hp){
        this.hp=hp;
        
    }
}
