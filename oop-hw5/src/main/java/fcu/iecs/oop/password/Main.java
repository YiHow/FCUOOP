package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**
   * This is main method.
   * @param args no
   */
  public static void main(String[] args) {
    PasswordEncorder encoder = new PasswordEncorder();
    Scanner scanner = new Scanner(System.in);
    String password;
    while (true) {
      System.out.println("Please enter a password:");
      password = scanner.nextLine();
      if (password.equals("exit")) {
        break;
      } else {
        System.out.println(encoder.encode(password));
      }
    }
  }
}
