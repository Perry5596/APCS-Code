/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three
{
  public static void main(String[] args)
  {
    
    /* Write your code here */
    Scanner input = new Scanner(System.in);
    System.out.println("Java is an object-oriented programming language, true or false?");
    boolean ans1 = input.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean ans2 = input.nextBoolean();
    
    System.out.println("\nQuestion 1 - Your answer: " + ans1 + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + ans2 + ". Correct answer: true");
  }
}