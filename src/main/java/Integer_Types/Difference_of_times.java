package Integer_Types;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Difference_of_times {
    public static void main(String[] args) {
        // Get seconds from two time moments in same day
        Scanner scanner = new Scanner(System.in);
        System.out.println(Duration.between(
                LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()),
                LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())).getSeconds());

        // Array version
        // todo why is not running for imput 1 2 3 4 5 6?
        /*Scanner sc = new Scanner(System.in);

        int[] time = new int[6];
        int i = 0;
        while (sc.hasNext()) {
            time[i] = sc.nextInt();
            i++;
        }
        System.out.println( (time[3] - time[0]) * 3600 +
                            (time[4] - time[1]) * 60 +
                            (time[5] - time[2]));*/
    }
}
