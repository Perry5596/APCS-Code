/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L3_Activity_Two 
{
  public static void main(String[] args) 
  {
    
    /* Write your code here */
    Scanner input = new Scanner(System.in);
    System.out.println("Hi there. What is your name?");
    String name = input.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    int age = input.nextInt();
    System.out.println(name + " is " + age + " years old.");
  }
}