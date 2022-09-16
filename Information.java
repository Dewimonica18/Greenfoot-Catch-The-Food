import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Information here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Information extends World
{

    /**
     * Constructor for objects of class Information.
     * 
     */
    public Information()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        instruct instruct = new instruct();
        addObject(instruct,203,197);
        Abtn abtn = new Abtn();
        addObject(abtn,140,340);
        Dbtn dbtn = new Dbtn();
        addObject(dbtn,232,339);
        next next = new next();
        addObject(next,182,436);
    }
}
