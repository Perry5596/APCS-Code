/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One
{
  public static void main(String[] args)
  {
      
      /* Write your code here */
      Scanner input = new Scanner(System.in);
      System.out.println("Enter starting nuber (must be an integer)");
      int n = input.nextInt();
      for(int i=0; i<4; i++) 
      {
        n++;
        System.out.println("number is now " + n);
      }
      for(int i=0; i<4; i++) 
      {
        n--;
        System.out.println("number is now " + n);
      }
  }
}