/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_Two
{
  public static void main(String[] args)
  {

    /* Write your code here */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of sides:");
    int sides = input.nextInt();
    System.out.println("Enter the side length:");
    double length = input.nextDouble();
    
    RegularPolygon p = new RegularPolygon();
    p.setNumSides(sides);
    p.setSideLength(length);
    double area1 = p.getArea();
    p.setNumSides(sides + 2);
    double area2 = p.getArea();
    
    System.out.println("Area with "+p.getNumSides()+" sides: "+area1);
    System.out.println("Incrementing the number of sides by two");
    System.out.println("Area with "+(p.getNumSides() + 2)+" sides: "+area2);
  }
}