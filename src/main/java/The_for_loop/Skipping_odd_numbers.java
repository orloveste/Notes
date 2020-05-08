package The_for_loop;

public class Skipping_odd_numbers {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        //same result
        // int n = 10;
        //for (int i = 0; i < n; i++) {
        //    if (i % 2 == 0) {
        //        System.out.print(i + " ");
        //    }
        //}
    }
}
