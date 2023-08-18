/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numerator:");
        int n = input.nextInt();
        System.out.println("Please enter the denominator:");
        int d = input.nextInt();
        double ans = (double) n / (double) d;

        System.out.println("\nThe decimal value is: " + String.format("%.2f", ans) );
    }
}