import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza extends Actor
{
    /**
     * Act - do whatever the pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+2);
        if(getY() >= getWorld().getHeight() -10)
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        
        if (isTouching(people.class))
        {
            getWorld().addObject(new pizza(), getX(), getY());
            removeTouching(pizza.class);
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
            //menambah score
            Game.Score.add(2);
            Greenfoot.playSound("point.mp3");
        }
    }    
}
