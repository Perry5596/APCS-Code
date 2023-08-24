/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import org.w3c.dom.css.Rect;
import shapes.*;

public class U2_L5_Activity_Two
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number for length and width:");
        double side = input.nextDouble();
        System.out.println("Type a length:");
        double len1 = input.nextDouble();
        System.out.println("Type a width:");
        double width1 = input.nextDouble();

        Rectangle rec1 = new Rectangle(side);
        Rectangle rec2 = new Rectangle(len1, width1);

        System.out.println(rec1);
        System.out.println(rec2);
    }
}