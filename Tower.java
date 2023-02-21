import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int fireRate=0; 
    public Tower(){
        getImage().scale(60,60);
        setRotation(90);
    }
    public void act() 
    {
        enemyDetector();
    } 
    public void enemyDetector(){
        fireRate++;
        List<Enemy> enemies=getObjectsInRange(100, Enemy.class);
        for(Enemy enemy:enemies){
            if(fireRate>=10){
                fireRate=0;
                Bullet bullet=new Bullet();
                getWorld().addObject(bullet,getX(),getY());
                turnTowards(enemy.getX(), enemy.getY());
                bullet.turnTowards(enemy.getX(),enemy.getY());
                Greenfoot.playSound("bazooka.wav");
            }
        }
    }
}
