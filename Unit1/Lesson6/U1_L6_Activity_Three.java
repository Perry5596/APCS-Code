/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        double n = input.nextDouble() * 1000;
        String nStr = Integer.toString((int) n);

        System.out.print("Answer: "+nStr.charAt(nStr.length() - 3)+" "+nStr.charAt(nStr.length() - 2)+" "+nStr.charAt(nStr.length() - 1));

    }
}