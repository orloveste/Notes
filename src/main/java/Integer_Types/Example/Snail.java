package Integer_Types.Example;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Snail creeps up the vertical pole of height 'H' feets." +
                "\n- Per day it goes 'A' feets up, and per night it goes 'B' feets down." +
                "\n- In which day the snail will reach the top of the pole?");

        System.out.print("\nEnter 'H' (2 < H >= 100): ");
        int H = reader.nextInt();
        System.out.print("Enter 'A' (H > A > B): ");
        int A = reader.nextInt();
        System.out.print("Enter 'B' (minim one): ");
        int B = reader.nextInt();

        int days = 1;
        int result = A; // need result to compare with H
        //for (days = 1; days < H; days++) { // count days
            do {
                int resultIntermediate = A - B; // night
                days++;
                result = resultIntermediate + result; // day add
            } while (!(result >= H));
        //}
        System.out.println(days);
    }
}
