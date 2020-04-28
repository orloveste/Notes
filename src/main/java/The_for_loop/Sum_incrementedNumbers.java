package The_for_loop;

public class Sum_incrementedNumbers {
    public static void main(String[] args) {
//        sum of the integer numbers from 1 to 10 (inclusive) using the for-loop.
        int startIncl = 1, endExcl = 11;

        int sum = 0;
        for (int i = startIncl; i < endExcl; i++) {
            sum += i;
            System.out.println(i + " ");
        }

        System.out.println(sum); // it prints "55"
    }// test another branch
}
