/**
 * oddsInRange.java
 *  Calculates the number of odds in a range of numbers.
 * 
 * @author Christopher Davis
 * @version 20170829
 */
package brainblasted.Math;

import java.util.*;

public class oddsInRange
{
    // This is to make a range inclusive when counting odds
    public static final int INCLUSIVE_RANGE = 1;

    public static void main(String[] args)
    {
        Scanner rangeInput = new Scanner(System.in);
        System.out.print("First number in range: ");
        String rangeStartStr = rangeInput.nextLine();
        int rangeStart = Integer.parseInt(rangeStartStr);
        System.out.print("Enter the second number: ");
        String rangeEndStr = rangeInput.nextLine();
        int rangeEnd = Integer.parseInt(rangeEndStr);
        rangeInput.close();
        oddCounter(rangeStart, rangeEnd);
    }

    public static void oddCounter(int rangeStart, int rangeEnd) 
    {
        // This algorithm was found on StackExchange in word form, for a math issue. 
        // Using it here programmatically.
        int numberOfOdds = (((rangeEnd - rangeStart)/2) + INCLUSIVE_RANGE);
        System.out.printf("The number of odds between %d and %d is %d. %n",
                                        rangeStart, rangeEnd, numberOfOdds);
    }
}