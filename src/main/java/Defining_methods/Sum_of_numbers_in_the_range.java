package Defining_methods;

import java.util.Scanner;

public class Sum_of_numbers_in_the_range {
    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0;
        for (int i = from; i < to; ++i) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
