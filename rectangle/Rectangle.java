import greenfoot.*;
public class Rectangle extends Actor {
  private int width;
  private int height;
  private Rectangle partner;  
  public Rectangle(int w,  int h) {
    width = w;
    height = h;
    getImage().scale(width*10, height*10);
  }
  
  public Rectangle(){
      partner = new Rectangle(10, 5);
      System.out.println("Width" + width + "Height"+ height + "Partner" + partner);
      //getImage().scale(width*10, height*10);
  }
  
  public static void main(String[] args){
    Rectangle rect1;
    rect1= new Rectangle(12, 10);
    System.out.println(rect1);
  }
  
  public String toString(){
      return "Rectangle " + System.identityHashCode(this) + "Rectangle width " + width + " Rectangle height " + height;
  }

}
