package fcu.iecs.oop;

public class Main {

  /**
   * Main.
   * @param args no
   */
  public static void main(String[] args) {
    OrderCake cake1 = new OrderCake("Cake1", 5.5, 2);
    OrderCake cake2 = new OrderCake("Cake2", 3.3, 4);
    ReadyMadeCake cake3 = new ReadyMadeCake("Cake3", 3, 3);
    ReadyMadeCake cake4 = new ReadyMadeCake("Cake4", 4, 5);
    ReadyMadeCake cake5 = new ReadyMadeCake("Cake5", 5, 7);
    Cake[] cakes = {cake1, cake2, cake3, cake4, cake5};
    double maxPrice = 0;
    
    for (Cake c:cakes) {
      System.out.println(c.getName() + " is " + c.calcPrice());
    }
    
    for (Cake c:cakes) {
      if (c instanceof ReadyMadeCake) {
        ReadyMadeCake c2 = (ReadyMadeCake)c;
        System.out.println(c2.getName() + " price is " + c2.calcPrice() 
            + " and quantity is " + c2.getQuantity());
      }
    }
    
    for (Cake c:cakes) {
      if (maxPrice < c.calcPrice()) {
        maxPrice = c.calcPrice();
      }
    }
    System.out.println("The highest price of cake is " + maxPrice);
  }

}
