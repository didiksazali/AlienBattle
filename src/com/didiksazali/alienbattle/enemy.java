package com.didiksazali.alienbattle;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
	public enemy(){
		setImage("enemy.png");
	}
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-2,y);
        if(x==0){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseDragged(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            if(mouse.getY()>(y-7) && mouse.getY()<(y+7)){
                getWorld().addObject(new bullet2(),getX(),getY());
                Greenfoot.playSound("bullet2.wav");
            }
        }
    }    
}
