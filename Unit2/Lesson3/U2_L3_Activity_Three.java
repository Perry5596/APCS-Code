/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = input.nextLine().toLowerCase();
        System.out.println("Enter second word:");
        String word2 = input.nextLine().toLowerCase();
        System.out.println("Result: " + word1.compareTo(word2));
    }
}