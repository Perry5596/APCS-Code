/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price: ");
        double price = input.nextDouble();
        double change = 10 - price;
        System.out.println("Change from $10: $" + String.format("%.2f", change));
    }
}