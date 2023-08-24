/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

class U2_L8_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first x-coordinate:");
        double x1 = input.nextDouble();
        System.out.println("Enter the second x-coordinate:");
        double x2 = input.nextDouble();
        System.out.println("Enter the first y-coordinate:");
        double y1 = input.nextDouble();
        System.out.println("Enter the second y-coordinate:");
        double y2 = input.nextDouble();

        double ans = (y2-y1) / (x2-x1);
        System.out.println("Slope: "+ans);
    }
}