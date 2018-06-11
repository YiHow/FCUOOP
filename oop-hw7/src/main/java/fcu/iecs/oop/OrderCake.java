package fcu.iecs.oop;

public class OrderCake extends Cake {

  private double weight;
  
  public double getWeight() {
    return weight;
  }

  public OrderCake(String name, double rate, double weight) {
    super(name, rate);
    this.weight = weight;
  }
  
  @Override
  public double calcPrice() {
    return weight * this.getRate();
  }

}
