package com.didiksazali.alienbattle;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.awt.Color;
import greenfoot.awt.Font;

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public score(){
        this(100);
    }

    /**
     * Create a score board for the final result.
     */
    public score(int score){
        makeImage("Game Over", "Skor: ", score);
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(0, 0, 0, 100));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(120, 170, 255, 255));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}