/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("What type of item are you buying?");
        String type = input.nextLine();
        System.out.println("How many are you buying?");
        int amount = input.nextInt();
        System.out.println("How much does each one weigh?");
        double weight = input.nextDouble();
        double totalWeight = weight * amount;
        System.out.println(amount+" "+type+" at "+weight+" pounds each will weigh "+totalWeight+" pounds total");
    }
}