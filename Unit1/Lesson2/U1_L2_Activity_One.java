/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One 
{
  public static void main(String[] args) 
  {
    
    /* Write your code here */
    System.out.print("What food do you like?: ");
    Scanner input = new Scanner(System.in);
    String food = input.nextLine();
    System.out.println("I like to eat " + food + " as well!");

    
  }
}