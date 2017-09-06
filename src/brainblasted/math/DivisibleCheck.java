/**
 * DivisibleCheck.java
 *  Checks the whether 'a' is divisible by 'b'.
 *  'a' is represented by firstNum, and 'b' is
 * +represented by secondNum.
 * 
 * @author Christopher Davis
 * @version 20170905
 */
package brainblasted.math;

import java.util.*;

public class DivisibleCheck
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        double firstNum  = keyboard.nextDouble();
        System.out.print("Please enter your second number: ");
        double secondNum  = keyboard.nextDouble();
        keyboard.close();
        if ((firstNum % secondNum) == 0)
        {
            System.out.printf("%.1f is divisible by %.1f. %n" +
                            "The quotient is %.1f.", firstNum, secondNum, (firstNum/secondNum));
        } else
        {
            System.out.printf("%.1f & %.1f are not divisible.", firstNum, secondNum);
        }
    }
}