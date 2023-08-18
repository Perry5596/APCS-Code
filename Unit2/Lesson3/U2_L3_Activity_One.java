/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();
        System.out.println("Enter a number:");
        int n = input.nextInt();

        String start = word.substring(0,n);
        String end = word.substring(word.length()-n,word.length());
        System.out.println(start+end);
    }
}