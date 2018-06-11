package selab.myapp;

import java.util.Scanner;

public class Grading {

  /**
   * find the last char from input string then print the grade.
   * @param args test.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a string :");
    String str = scanner.nextLine();
    char lastWord = str.charAt(str.length() - 1);
    switch (lastWord) {
      case 'A':
      case 'a': 
        System.out.println("Excellent!");
        break;
      case 'B': 
      case 'b': 
        System.out.println("Very good!");
        break;
      case 'C':
      case 'c':
        System.out.println("Good!");
        break;
      case 'D':
      case 'd': 
        System.out.println("Not bad!");
        break;
      default:
        System.out.println("Invalid!");
    }
    scanner.close();
  }
}
