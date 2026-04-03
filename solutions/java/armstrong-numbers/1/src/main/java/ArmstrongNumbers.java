import java.util.ArrayList;
import java.util.List;

/**
 * The ArmstrongNumbers class contains a method to check whether a given
 * number qualifies as an Armstrong Number.
 * 
 * A number qualifies when the sum of its own digits, each raised to the
 * power of the number of digits, is equal to the number.
 */

class ArmstrongNumbers {

    /**
     * Calculates whether a given number qualifies as an Armstrong Number.
     *
     * @param numberToCheck the number being checked; must be an int
     * @return true if number is an Armstrong Number,
     *         false if the number is not an Armstrong Number
     */
    boolean isArmstrongNumber(int numberToCheck) {

        int power = 0;
        int number = Math.abs(numberToCheck);
        int calculation = 0;

        List<Integer> digits = new ArrayList<>();

        if (number == 0) {
            digits.add(0, 0);
            power = 1;
        }

        while (number > 0) {
            digits.add(0, number % 10);
            number /= 10;
            power++;
        }

        for (int digit : digits) {
            int term = 1;
            for (int i = 0; i < power; i++) {
                term *= digit;
            }
            calculation += term;
        }

        return calculation == numberToCheck;
        
    }

}
