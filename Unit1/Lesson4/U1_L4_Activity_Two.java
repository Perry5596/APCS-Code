/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L4_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Feet: ");
        int feet = input.nextInt();
        int yard = feet / 3;
        System.out.println(yard);
    }
}