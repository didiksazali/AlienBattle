package com.didiksazali.alienbattle;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class hero extends Actor
{
	public hero(){
		setImage("hero.png");
	}
    /**
     * Act - do whatever the ps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private sky pl;
    public void addedToWorld(World sky){
        pl=(sky)sky;
    }
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseDragged(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        if(Greenfoot.mousePressed(null)) {
            pl.addObject(new bullet1(),getX()+getImage().getHeight(),getY());
            Greenfoot.playSound("bullet1.wav");
        }
        Actor a=getOneObjectAtOffset(0,0,enemy.class);
        if(a!=null){
            getWorld().addObject(new fire(),getX(),getY());
            ((sky)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            sky.gs=new GreenfootSound("fail.wav");
            sky.gs.play();
        }    
    }
}