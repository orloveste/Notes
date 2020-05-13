package Defining_methods;

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
        System.out.println(gcd(1,3));
        System.out.println(gcd(1,1));
        System.out.println(gcd(3,6));
        System.out.println(gcd(3,7));
        System.out.println(gcd(4,6));
        System.out.println(gcd(6,2));

    }
}
