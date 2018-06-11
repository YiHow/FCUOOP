package selab.myapp;

import java.util.Scanner;

public class Temperature {
  
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
	  
    System.out.println("Input the celsius : ");
    int t = scanner.nextInt();
    
    Temperature temperature = new Temperature();
    double f = temperature.convertTemperature(t);
    
    System.out.println(t + " degree celsius is " + f + " farenheit.");
    
  }
  
  public double convertTemperature(int celsius) {
    double farenheit = celsius * 9 / 5.0 + 32;
    return farenheit;
  }
}
