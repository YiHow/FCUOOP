package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**
   * This is main method.
   * @param args no
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int loop;
    NissanTiida square = new NissanTiida();
    System.out.println("Please enter a number:");
    loop = scanner.nextInt();
    for (int i = 0; i < loop; i++) {
      square.tiida();
      System.out.println();
    }
  }
}
