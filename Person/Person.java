/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Person  
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;
    private GreenfootSound sound;
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
    }
    public Person(String namePerson){
        name = namePerson;
    }
    public Person(String namePerson, int sp){
        name = namePerson;
        speed = sp;
    }
    public void walk(){
        
    }
    public String toString(){
        return name;
    }
    
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("JOHN");
        Person p3 = new Person("JOHNNE", 3);
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
