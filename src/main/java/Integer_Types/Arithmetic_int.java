package Integer_Types;

public class Arithmetic_int {
    public static void main(String[] args) {
        // other possible forms *=, /=, %= and some others
        int n = 10;
        n += 4; // 14
        System.out.println(n);

        // arithmetic operations work with the long type as well
        long one = 1L;
        long twentyTwo = 22L; // L or l is a literal for longs
        long bigNumber = 100_000_000_000L;

        long result = bigNumber + twentyTwo - one;
        System.out.println(result); // 100000000021

        // improve the readability of your code
        int million = 1_000_000;
        System.out.println("Print "+ million+" can be different inCode=>  1_000_000");


        int two = 2;
        int ten = 10;
        System.out.println("first int "+two+ " second int "+ten);
        int twelve = two + ten; // 12
        System.out.println("two + ten = "+ twelve);
        int eight = ten - two;  // 8
        System.out.println("ten - two = "+ eight);
        int twenty = two * ten; // 20
        System.out.println("two * ten = " + twenty);
        int five = ten / two;   // 5
        System.out.println("ten / two = " + five);
        int zero = ten % two;   // 0, no remainder
        System.out.println("ten % two = " + zero);

        int minusTwo = -two; // -2
        System.out.println("int minusTwo = -two;  = " + minusTwo);
    }
}
