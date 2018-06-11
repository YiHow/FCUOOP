package fcu.iecs.oop.tiida;

public class NissanTiida {
  /**
   * the times of calling this method.
   */
  public int time = 1;
  
  /**
   * print the square of *.
   */
  public void tiida() {
    for (int i = 0; i < time; i++) {
      for (int j = 0; j < time; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    time++;
  }
}
