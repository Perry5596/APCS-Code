/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        int difference = (int) Math.abs(Math.round(x2 - x1));
        System.out.println("Difference: "+difference);
    }
}