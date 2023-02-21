import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int level;
    
    public Button(int level){
        //music.play();
        this.level=level;
        if(level==1){
            setImage(new GreenfootImage("Easy",30,Color.BLACK,new Color(0,0,0,0)));
        }
        else if(level==2){
            setImage(new GreenfootImage("Medium",30,Color.BLACK,new Color(0,0,0,0)));
        }
        else if(level==3){
            setImage(new GreenfootImage("Hard",30,Color.BLACK,new Color(0,0,0,0)));
        }
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            //music.stop();
                if(level==1){
                Greenfoot.setWorld(new MyWorld(level));
            }
            else if(level==2){
                Greenfoot.setWorld(new MyWorld(level));
            }
            else if(level==3){
                Greenfoot.setWorld(new MyWorld(level));
            }
            
        }
    }    
}
