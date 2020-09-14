import java.util.Scanner;

/**
 * a program to divide two numbers and calculate the quotient of the number and the remainder
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // Creates a scanner used for input
   Scanner input = new Scanner(System.in);

   //declare and initialize a constant to store the first integer 
  int F_INTEGER = 10;

   //declare and initialize the a variable to store the second integer 
   int sInteger = 3;

   System.out.println("Please enter in two integers, on seperate lines, to divide.");

      //declare and calculate the quotient and remainder 
   int quot = F_INTEGER / sInteger;

   //Tell the user the quotient and remainder
   System.out.println("10/3 is " + sInteger + " with a remainder of 1");

   
  }
}
