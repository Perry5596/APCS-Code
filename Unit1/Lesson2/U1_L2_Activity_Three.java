/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L2_Activity_Three 
{
  public static void main(String[] args) 
  {
    
    /* Write your code here */
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi there. What is your name?");
    String name = input.nextLine();
    System.out.println("What state do you live in?");
    String state = input.nextLine();
    
    System.out.println("My name is " + name + ". I live in " + state + ".");
  }
}