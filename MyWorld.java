import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int timer;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int money=100;
    public int Tower1_price=100;
    public int Tower2_price=150;
    public int Tower3_price=200;
    public boolean clicked=false;
    int x;
    int y;
    
    public int level;
    
    
    Tower1_button button1=new Tower1_button();
    Tower2_button button2=new Tower2_button();
    Tower3_button button3=new Tower3_button();
    
    Carrot carrot=new Carrot();
    public int hp=carrot.hp;
    HPDisplay hpdisplay=new HPDisplay(hp);
    int[][] map1={
                         {0,0,0,0,0,0,0,0,0,0},
                         {1,1,1,1,1,1,1,1,1,2},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,0}
                        };
    int[][] map2={
            {0,0,0,0,0,0,0,0,0,0},
            {1,1,2,0,3,1,1,1,1,2},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,3,1,4,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,0}
        };      
    int[][] map3={
                         {0,0,0,0,0,0,0,0,0,0},
                         {1,2,0,0,0,3,1,1,1,2},
                         {0,3,1,2,0,1,0,0,0,1},
                         {0,0,0,1,0,4,1,5,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,3,1,1,1,4,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,0}
                        };                    
                     
    Selected selected=new Selected();
    public MyWorld(int level)
    {    
        
        super(840, 600, 1); 
        money=100;
        //this.level=level;
        this.timer=0;
        this.level=level;
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        /*
        if(level==1){
            this.map=new int[10][10];
            map=
            {
                         {0,0,0,0,0,0,0,0,0,0},
                         {1,1,1,1,1,1,1,1,1,2},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,0}
                        };
        }
        else if(level==2){
            int initmap[][]={
            {0,0,0,0,0,0,0,0,0,0},
            {1,1,2,0,3,1,1,1,1,2},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,1,0,1,0,0,0,0,1},
            {0,0,3,1,4,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,0}
        };
        }
        
        else if(level==3){
                        int initmap[][]={
                         {0,0,0,0,0,0,0,0,0,0},
                         {1,2,0,0,0,3,1,1,1,2},
                         {0,3,1,2,0,1,0,0,0,1},
                         {0,0,0,1,0,4,1,5,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,3,1,1,1,4,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,0}
                    };
        }
        else{
            int initmap[][]={
                         {0,0,0,0,0,0,0,0,0,0},
                         {1,2,0,0,0,3,1,1,1,2},
                         {0,3,1,2,0,1,0,0,0,1},
                         {0,0,0,1,0,4,1,5,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,1,0,0,0,1,0,1},
                         {0,0,0,3,1,1,1,4,0,1},
                         {0,0,0,0,0,0,0,0,0,1},
                         {0,0,0,0,0,0,0,0,0,0}
                    };
        }
        this.map=initmap;*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    //1:go straight; 2:down 3:right 4:up 5:left
    
    
    public void act(){
        if(clicked==false){
            waitForClick();
        }
        else{
            addInTower();
        }
        //showText("Money:"+money,660,30);
        hp=carrot.hp;
        hpdisplay.update(hp);
        wave();
        timer++;
    }
    
    public void wave(){
        if(timer==0){
            countdown(10);
        }
        else if(timer>600&&timer<1200){
            if(timer%400==0){
                /*
                Enemy e=new Enemy();
                addObject(e,30,90);
                addObject(new Health_bar(e.health,e),30,100);
                */
                addObject(new Enemy(),30,90);
                
            }
        }
        else if(timer==1200){
            countdown(10);
        }
        else if(timer>1800&&timer<2400){
            if(timer%100==0){
                addObject(new Enemy(),30,90);
            }
        }
        else if(timer==2400){
            countdown(10);
        }
        else if(timer>3000&&timer<3600){
            if(timer%20==0){
                addObject(new Enemy(),30,90);
            }
        }
        else if(timer==3600){
            countdown(10);
        }
        else if(timer>4200&&timer<4800){
            if(timer%10==0){
                addObject(new Enemy(),30,90);
            }
        }
        else if(timer==4800){
            countdown(10);
        }
        else if(timer==5400){
            addObject(new Boss1(),30,90);
        }
        
    }
    
    public void countdown(int time){
        addObject(new Countdown(time),720,450);
    }
    
    public void next_level(int level){
        
    }
    
    
    
    private void prepare()
    {
        Menu menu=new Menu();
        addObject(carrot,570,570);
        addObject(menu,720,300);
        addObject(new MoneyDisplay(),720,30);
        addObject(button1,670,180);
        addObject(button2,770,180);
        addObject(button3,670,300);
        addObject(new Money(100),670,230);
        addObject(new Money(150),770,230);
        addObject(new Money(200),670,350);
        addObject(new Exit(),720,500);
        addObject(new Restart(),720,550);
        addObject(hpdisplay,700,100);
        if(level==1){
            Level1();
        }
        else if(level==2){
            Level2();
        }
        else if(level==3){
            Level3();
        }
        /*
        Tower tower = new Tower();
        addObject(tower,143,248);
        Tower tower2 = new Tower();
        addObject(tower2,146,335);
        Enemy enemy = new Enemy();
        addObject(enemy,34,94);
         */
       
    }
    
    private void Level1(){
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++){
                if(map1[j][i]==1){
                    addObject(new Road(true),30+i*60,30+j*60);
                }
                else if(map1[j][i]==2){
                    addObject(new Road(90),30+i*60,30+j*60);
                }
                else if(map1[j][i]==3){
                    addObject(new Road(0),30+i*60,30+j*60);
                }
                else if(map1[j][i]==4){
                    addObject(new Road(270),30+i*60,30+j*60);
                }
                else if(map1[j][i]==5){
                    addObject(new Road(180),30+i*60,30+j*60);
                }
            }
    }
    
    private void Level2(){
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++){
                if(map2[j][i]==1){
                    addObject(new Road(true),30+i*60,30+j*60);
                }
                else if(map2[j][i]==2){
                    addObject(new Road(90),30+i*60,30+j*60);
                }
                else if(map2[j][i]==3){
                    addObject(new Road(0),30+i*60,30+j*60);
                }
                else if(map2[j][i]==4){
                    addObject(new Road(270),30+i*60,30+j*60);
                }
                else if(map2[j][i]==5){
                    addObject(new Road(180),30+i*60,30+j*60);
                }
            }
    }
    private void Level3(){
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++){
                if(map3[j][i]==1){
                    addObject(new Road(true),30+i*60,30+j*60);
                }
                else if(map3[j][i]==2){
                    addObject(new Road(90),30+i*60,30+j*60);
                }
                else if(map3[j][i]==3){
                    addObject(new Road(0),30+i*60,30+j*60);
                }
                else if(map3[j][i]==4){
                    addObject(new Road(270),30+i*60,30+j*60);
                }
                else if(map3[j][i]==5){
                    addObject(new Road(180),30+i*60,30+j*60);
                }
            }
    }
    
    public void waitForClick(){
        if(Greenfoot.mouseClicked(null)&&Greenfoot.getMouseInfo().getActor()==null){
            x=(Greenfoot.getMouseInfo().getX()/60)*60+30;
            y=(Greenfoot.getMouseInfo().getY()/60)*60+30;
            clicked=true;
            
            addObject(selected,x,y);
        }
        
    }
    public void addInTower(){
        if(Greenfoot.mouseClicked(button1)){
            if(money>=Tower1_price){
                addObject(new Tower(), x, y);
                money-=Tower1_price;
                clicked=false;
                removeObject(selected);
            }
            else{
                clicked=false;
                removeObject(selected);
            }
        }
        else if(Greenfoot.mouseClicked(button2)){
            if(money>=Tower2_price){
                addObject(new Tower2(), x, y);
                money-=Tower2_price;
                clicked=false;removeObject(selected);
            }
            else{
                clicked=false;removeObject(selected);
            }
        }
        else if(Greenfoot.mouseClicked(button3)){
            if(money>=Tower3_price){
                addObject(new Tower3(), x, y);
                money-=Tower3_price;
                clicked=false;removeObject(selected);
            }
            else{
                clicked=false;removeObject(selected);
            }
        }
        
        
        if(Greenfoot.mouseClicked(null)){
            clicked=false;removeObject(selected);
        }
    }
}
