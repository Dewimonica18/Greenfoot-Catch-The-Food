import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mic extends Actor
{
    /**
     * Act - do whatever the mic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+2);
        if(getY() >= getWorld().getHeight() -10)
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        
        if (isTouching(people.class))
        {
            getWorld().addObject(new mic(), getX(), getY());
            removeTouching(mic.class);
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            Game.Live.add(-1);
            Greenfoot.playSound("fail.mp3");
            if(Game.Live.getValue()==0)
            {
                Greenfoot.setWorld(new End());
                Greenfoot.playSound("gameover.mp3");
            }
        }
    }    
}
