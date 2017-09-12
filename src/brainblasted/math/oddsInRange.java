/*
    Copyright (C) 2017  BrainBlasted

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/**
 * oddsInRange.java
 *  Calculates the number of odds in a range of numbers.
 * 
 * @author Christopher Davis
 * @version 20170829
 */
package brainblasted.math;

import java.util.*;

public class oddsInRange {
    // This is to make a range inclusive when counting odds
    public static final int INCLUSIVE_RANGE = 1;

    public static void main(String[] args) {
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

    public static void oddCounter(int rangeStart, int rangeEnd) {
        // This algorithm was found on StackExchange in word form, for a math issue. 
        // Using it here programmatically.
        int numberOfOdds = (((rangeEnd - rangeStart)/2) + INCLUSIVE_RANGE);
        System.out.printf("The number of odds between %d and %d is %d. %n",
                                        rangeStart, rangeEnd, numberOfOdds);
    }
}