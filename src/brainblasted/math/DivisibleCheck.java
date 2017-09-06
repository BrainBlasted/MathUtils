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