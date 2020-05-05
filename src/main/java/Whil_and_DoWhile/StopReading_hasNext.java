package Whil_and_DoWhile;

import java.util.Scanner;

public class StopReading_hasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            sum += elem;
        }

        System.out.println(sum);
    }
}
// ctrl^d to stop and print sum