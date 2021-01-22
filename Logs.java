/*
*
* The Logs program calculates the number of logs that
* the truck can carry of the log size the user has chosen.
*
* @author  Wajd Mariam
* @version 1.0
* @since   2020/11/22
*/
 
import java.util.Scanner;

public class Logs {
  /**
   * This function calucaltes to the user the number of logs a truck can carry
   * depedning on the number of logs the user inputs. 
   */
  public static void main(String[] args) {
        
    // Input 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of the logs (m)");
    System.out.println("(Valid options are 0.25, 0.5, 1 m):");
    double lengthoflogs = input.nextDouble();
        
    // closing the scanner object 
    input.close();
        
    // Process
    double trucklogs = (1100 / (lengthoflogs * 20));
        
    // Output
    System.out.println();
    System.out.println("The truck can carry " + (Math.round(trucklogs)) + " logs.");
  }
}
