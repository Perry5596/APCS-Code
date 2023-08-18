/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();
        System.out.println("How many characters would you like to delete at the end?");
        int n = input.nextInt();

        String newWord = word.substring(0,word.length()-n);
        System.out.println(newWord);
    }
}