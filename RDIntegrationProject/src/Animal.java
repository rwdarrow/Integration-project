/**
 * Description: Animal is the superclass (parent class) of The Cat class. It contains three
 * fields which are inherited by Cat: weight, height, and sleep state (isAsleep). the Cat class
 * has access to the fields and methods contained in Animal, in addition to its additional
 * fields and methods. 
 */

public class Animal {
  private int weight;
  private int height;
  private boolean isAsleep;
  
  public Animal (int weight, int height) {
    this.weight = weight;
    this.height = height;
    this.isAsleep = false;
  }
  
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  public void setHeight (int height) {
    this.height = height;
  }
  
  public void makeSleep() {
    isAsleep = true;
  }
  
  public void wakeUp() {
    isAsleep = false;
  }
  
  public int getWeight() {
    return weight;
  }
  
  public int getHeight() {
    return height;
  }
  
  public boolean getSleepState() {
    return isAsleep;
  }
}
