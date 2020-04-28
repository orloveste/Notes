package The_for_loop;

public class multiplication_table {
    public static void main(String[] args) {
//        multiplication table of numbers from 1 to 9 (inclusive).

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
