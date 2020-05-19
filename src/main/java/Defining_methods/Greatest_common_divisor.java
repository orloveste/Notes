package Defining_methods;

import Increment_and_decrement.Ex1;

public class Greatest_common_divisor {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        Ex1.duplicate(gcd(1,3), gcd(1,1), gcd(3,6), gcd(3,7), gcd(4,6), gcd(6,2));

    }
}
