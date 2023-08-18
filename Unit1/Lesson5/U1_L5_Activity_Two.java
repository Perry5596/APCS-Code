/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a four digit number: ");
        int n = input.nextInt();
        String nStr = Integer.toString(n);
        for(int i=nStr.length(); i>0 ; i--)
        {
            System.out.println(nStr.charAt(i-1));
        }
    }
}