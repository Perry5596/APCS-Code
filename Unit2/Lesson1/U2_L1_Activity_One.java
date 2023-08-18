/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your favorite number?");
        int number = input.nextInt();
        System.out.println("Your name is "+name+" and you like the number "+number+".");
    }
}