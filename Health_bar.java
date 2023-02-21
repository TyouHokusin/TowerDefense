import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health_bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health_bar extends Actor
{
    /**
     * Act - do whatever the Health_bar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health;
    int max_health;
    int x=0;
    int y=0;
    Enemy enemy;
    public Health_bar(int health,Enemy enemy){
        this.health=health;
        this.max_health=health;
        this.enemy=enemy;
        setImage(new GreenfootImage(this.health+"/"+this.max_health,20,Color.BLACK,new Color(0,0,0,0)));
        setLocation(enemy.getX(), enemy.getY()+10);
    }
    public void act() 
    {
        
        setImage(new GreenfootImage(enemy.health+"/"+this.max_health,20,Color.BLACK,new Color(0,0,0,0)));
        setLocation(enemy.getX(), enemy.getY()+10);
    }    
    public void update(int health,int x,int y){
        this.health=health;
        this.x=x;
        this.y=y;
    }
}
