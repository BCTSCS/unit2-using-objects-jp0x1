import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String type;
    private int size;
    private Actor toppings;
    public Pizza(String theType, int theSize){
        type = theType;
        size = theSize;
    }
    @Override  
    protected void addedToWorld(World world){
        toppings= new Cheese();
        world.addObject( toppings, getX(), getY());

    }
    public void act()
    {
        // Add your action code here.
        
    }
}
