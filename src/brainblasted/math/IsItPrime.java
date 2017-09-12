/**
 * IsItPriem.java
 *  Checks whether a given number is prime.
 */
package brainblasted.math;

import java.util.*;

public class IsItPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter the number you want to check: ");
        if (isPrimeNumber(keyboard)) {
            System.out.println("The number is prime. ");
        } else {
            System.out.println("The number is not prime. ");
        }
    }

    public static boolean isPrimeNumber(Scanner numInput) {
        if (!numInput.hasNextInt()) {
            return false;
        } else {
            int numToCheck = numInput.nextInt();
            if (numToCheck == 2) {
                return true;
            } else if (numToCheck == 3) {
                return true;
            } else if (numToCheck == 5) {
                return true;
            } else if (numToCheck == 7) {
                return true;
            } else if (divisibleByNumber(numToCheck, 5)) {
                return false;
            } else if (!divisibleByNumber(numToCheck, 2) && 
            !divisibleByNumber(numToCheck, 3) &&
            !divisibleByNumber(numToCheck, 4) &&
            !divisibleByNumber(numToCheck, 5) &&
            !divisibleByNumber(numToCheck, 6) &&
            !divisibleByNumber(numToCheck, 7) &&
            !divisibleByNumber(numToCheck, 8) &&
            !divisibleByNumber(numToCheck, 9) &&
            !divisibleByNumber(numToCheck, 10) &&
            divisibleByNumber(numToCheck, 1)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean divisibleByNumber(int checkedNumber, int numForDivision) {
        if (checkedNumber % numForDivision != 0) {
            return false;
        } else {
            return true;
        }
    }
}
