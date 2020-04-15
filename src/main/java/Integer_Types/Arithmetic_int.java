package Integer_Types;

public class Arithmetic_int {
    public static void main(String[] args) {
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
