package Defining_methods;

import java.util.Scanner;

public class Rise_to_power {
    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
