import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starting_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starting_menu extends World
{

    /**
     * Constructor for objects of class Starting_menu.
     * 
     */
    GreenfootSound music=new GreenfootSound("karma.mp3");
    Button button1=new Button(1);
    Button button2=new Button(2);
    Button button3=new Button(3);
    public Starting_menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(button1,300,200);
        addObject(button2,300,250);
        addObject(button3,300,300);
        prepare();
        music.play();
    }
    public void act(){
        if(Greenfoot.mouseClicked(button1)||Greenfoot.mouseClicked(button2)||Greenfoot.mouseClicked(button3)){
            music.stop();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Title title = new Title("Java Big Homework\n---By 2016012203",10,40);
        addObject(title,300,100);
        
    }
}
