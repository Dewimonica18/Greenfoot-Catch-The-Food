import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burger extends Actor
{
    /**
     * Act - do whatever the burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //static Counter Score = new Counter ("Score: ");
    public void act() 
    {
        setLocation(getX(), getY()+2);
        if(getY() >= getWorld().getHeight() -10)
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        
        if (isTouching(people.class))
        {
            getWorld().addObject(new burger(), getX(), getY());
            removeTouching(burger.class);
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            //menambah score
            Game.Score.add(2);
            Greenfoot.playSound("point.mp3");
        }
        
        {
            
        }
    }    
}
