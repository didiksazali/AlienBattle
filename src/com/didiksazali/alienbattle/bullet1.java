package com.didiksazali.alienbattle;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet1 extends Actor
{
	public bullet1(){
		setImage("bullet1.png");
	}
    /**
     * Act - do whatever the pelor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x=getX();
        int y=getY();
        setLocation(x+29,y);
        if(x == 853){
            getWorld().removeObject(this);
            return;
        }
        Actor a = getOneObjectAtOffset(0 ,0, enemy.class);
        if(a != null){
            getWorld().addObject(new fire(),getX(),getY());
            ((sky)getWorld()).tambah();
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            return;
        }
    }    
}
