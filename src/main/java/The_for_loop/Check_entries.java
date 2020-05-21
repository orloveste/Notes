package The_for_loop;

import java.util.Scanner;

public class Check_entries {
    public static void main(String[] args) {
        Scanner reder = new Scanner(System.in);
        int numberOfEntries = reder.nextInt();
        int a = 0; //= 5
        int b = 0; //= 4
        int c = 0; //= 3
        int d = 0; //= 2

        for (int i = 0; i < numberOfEntries; i++) {
            int entryCheck = reder.nextInt();
            if (entryCheck == 5) {
                a++;
            } else if (entryCheck == 4) {
                b++;
            } else if (entryCheck == 3) {
                c++;
            } else if (entryCheck == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
