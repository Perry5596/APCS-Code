/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a circumference:");
        double circumference = input.nextDouble();

        double radius = circumference / 2 / Math.PI;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Radius: " + String.format("%.2f", radius));
        System.out.println("Area: " + String.format("%.2f", area));
    }
}