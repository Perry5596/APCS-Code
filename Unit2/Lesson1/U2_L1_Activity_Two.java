/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L1_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        String order = "apple pie";
        System.out.println("The current order is "+order);
        System.out.println("I want to eat something else, what do you want to eat?");
        order = input.nextLine();
        System.out.println("The order has changed to "+order);
    }
}