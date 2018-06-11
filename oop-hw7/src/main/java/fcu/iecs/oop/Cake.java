package fcu.iecs.oop;

public abstract class Cake {

  private String name;
  
  private double rate;
  
  /**
   * Cake.
   * @param name name
   * @param rate rate
   */
  public Cake(String name, double rate) {
    this.name = name;
    this.rate = rate;
  }
  
  public abstract double calcPrice();
  
  public String toString() {
    return name + "\t" + rate;
  }

  public String getName() {
    return name;
  }

  public double getRate() {
    return rate;
  }
  
}
