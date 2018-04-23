package com.didiksazali.alienbattle;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet2 extends Actor
{
	public bullet2(){
		setImage("bullet2.png");
	}
    /**
     * Act - do whatever the pelor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x-32,y);
        if(x==0){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneIntersectingObject(hero.class);
        if(a != null){
            getWorld().addObject(new fire(),getX(),getY());
            ((sky)getWorld()).selesai();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            sky.gs=new GreenfootSound("fail.wav");
            sky.gs.play();
        }
    }    
}