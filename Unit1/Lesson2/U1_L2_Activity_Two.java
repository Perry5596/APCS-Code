/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two 
{
  public static void main(String[] args) 
  {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("PLease enter four names: ");
    String nameA = scan.nextLine();
    String nameB = scan.nextLine();
    String nameC = scan.nextLine();
    String nameD = scan.nextLine();
    
    System.out.println(nameD + " " + nameB + " " + nameC + " " + nameA);
  }
}