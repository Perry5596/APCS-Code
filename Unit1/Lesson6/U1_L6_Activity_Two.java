/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two decimal numbers:");
        double a = Math.round(input.nextDouble());
        double b = Math.round(input.nextDouble());
        double ans = a + b;
        System.out.println("Answer: "+a+" + "+b+" = "+ans);
    }
}