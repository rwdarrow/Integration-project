/**
 * Description: The Cat class is the subclass of Animal. By extending the Animal class, it 
 * inherits all its properties and methods. The superclass constructor is called to initialize
 * the members contained within the parent class. The Cat class has the ability to call 
 * methods of Animal class as well as its own. 
 * 
 * The Animal and Cat classes are examples of inheritance and polymorphism. The Cat class
 * inherits the Animal class, demonstrating inheritance. The Cat class overrides the sleep and 
 * wake up methods of the superclass by extending their functionality, demonstrating polymorphism.
 */

public class Cat extends Animal {
  private String color;
  private boolean isTired;
  
  /**
   * Default Constructor
   */
  public Cat() {
    super(1, 1);
    color = "color";
    isTired = false;
  }
  
  public Cat (int weight, int height, String color, String favFood) {
    super(weight, height);
    
    this.color = color;
    this.isTired = false;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public void setTired(boolean state) {
    this.isTired = state;
  }
  
  public String getColor() {
    return color;
  }
  
  public boolean getTired() {
    return isTired;
  }
  
  public void makeSleep() {
    if (isTired) {
      System.out.println("The cat is tired and will sleep");
      super.makeSleep();
    }
    else
      System.out.println("The cat is not tired and won't sleep");
  }
  
  public void wakeUp() {
    if (isTired) {
      System.out.println("The cat is tired and won't wake up");
    }
    else {
      System.out.println("The cat is not tired and will wake up");
      super.wakeUp();
    }
  }
}
