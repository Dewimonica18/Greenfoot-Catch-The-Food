import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    static Counter Score = new Counter ("Score: ");
    static Counter Live = new Counter ("Lives: ");
    public Game()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        people people = new people();
        addObject(people,233,534);
        bag bag = new bag();
        addObject(bag,246,362);
        burger burger = new burger();
        addObject(burger,387,470);
        cupcake cupcake = new cupcake();
        addObject(cupcake,366,178);
        glasses glasses = new glasses();
        addObject(glasses,157,432);
        latte latte = new latte();
        addObject(latte,28,369);
        mic mic = new mic();
        addObject(mic,96,134);
        pizza pizza = new pizza();
        addObject(pizza,401,321);
        potato potato = new potato();
        addObject(potato,243,224);
        ramen ramen = new ramen();
        addObject(ramen,100,254);
        salad salad = new salad();
        addObject(salad,388,75);
        shoe shoe = new shoe();
        addObject(shoe,189,70);
        takoyaki takoyaki = new takoyaki();
        addObject(takoyaki,47,31);
        addObject(Score, 445,580);
        addObject(Live, 53, 580);
        Score.setValue(0);
        Live.setValue(8);
        glasses.setLocation(215,306);
        glasses.setLocation(271,127);
        burger.setLocation(377,410);
    }
    
}