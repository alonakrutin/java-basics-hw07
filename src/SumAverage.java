import java.util.Arrays;

/**
 * Compute the sum and average for running integers using loop.
 */

public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        // TODO fill in code here using for loop and replace the return statement
        int sum = 0;
        for (int h = lowerBound; h <= upperBound; h++) {
            sum = sum + h;
        }
        return sum;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        // TODO fill in code here using for each loop and replace the return statement
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        // TODO fill in code here using while loop and replace the return statement
        double average;
        int sum = 0;
        double count = 0;
        int h = lowerBound;
        while (h <= upperBound) {
            sum = sum + h;
            h++;
            count++;
        }
        average = sum / count;
        return average;
        // return -1;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        // TODO fill in code here using do-while loop and replace the return statement
        int sum = 0;
        double count = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
            count++;
        } while (i < numbers.length);
        return sum / count;
    }
}