/* Lesson 5 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Three
{
    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Type a side length:");
        double tri = input.nextDouble();

        RegularPolygon triangle = new RegularPolygon(tri);
        RegularPolygon square = new RegularPolygon(4, tri);

        System.out.println(triangle);
        System.out.println(square);
    }
}