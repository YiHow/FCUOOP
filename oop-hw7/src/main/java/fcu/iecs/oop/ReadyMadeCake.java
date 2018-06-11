package fcu.iecs.oop;

public class ReadyMadeCake extends Cake {
 
  private int quantity;
  

  public int getQuantity() {
    return quantity;
  }

  public ReadyMadeCake(String name, double rate, int quantity) {
    super(name, rate);
    this.quantity = quantity;
  }

  @Override
  public double calcPrice() {
    return quantity * this.getRate();
  }

}
