package com.didiksazali.alienbattle;
import greenfoot.*;

/**
 * 
 */
public class sky extends World
{
    Counter counter = new Counter("Skor: ");
    static GreenfootSound gs=new GreenfootSound("fail.wav");
    /**
     * Constructor for objects of class bg.
     * 
     */
    public sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        this.setBackground("sky.jpg");
        setPaintOrder(score.class, fire.class, cloud.class, hero.class, enemy.class, Counter.class, bullet1.class, bullet2.class);
        addObject(new cloud(),690,20);
        addObject(new hero(),50,220);
        addObject(new enemy(),785,320);
        addObject(counter,120,450);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(1000)<4){
            addObject(new cloud(),853,Greenfoot.getRandomNumber(70));
        }
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new enemy(),853,Greenfoot.getRandomNumber(479));
        }
        if(Greenfoot.mousePressed("space")){
            Greenfoot.stop();
        }
    }
    public void tambah(){
        counter.add(20);
    }

    /**
     * Called when game is up. Stop running and display score.
     */
    public void selesai() 
    {
        addObject(new score(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
}