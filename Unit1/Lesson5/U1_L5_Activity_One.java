/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a three digit number: ");
        int n = input.nextInt();
        String nStr = Integer.toString(n);
        for(int i=0; i<nStr.length(); i++)
        {
            System.out.println(nStr.charAt(i));
        }
    }
}