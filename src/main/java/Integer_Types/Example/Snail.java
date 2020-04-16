package Integer_Types.Example;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Snail creeps up the vertical pole of height 'H' feets." +
                "\n- Per day it goes 'A' feets up, and per night it goes 'B' feets down." +
                "\n- In which day the snail will reach the top of the pole?");

        System.out.print("\nEnter 'H' (2 < H >= 100): ");
        int hight = reader.nextInt();
        System.out.print("Enter 'A' (H > A > B): ");
        int dayMove = reader.nextInt();
        System.out.print("Enter 'B' (minim one): ");
        int nightNegativeMove = reader.nextInt();

        int days = 1;
        int result = dayMove; // need result to compare with H
        if ((dayMove > nightNegativeMove) && (hight > dayMove)) {
            // todo = 2 code style errors on https://hyperskill.org/learn/step/2221
            do {
                int resultIntermediate = dayMove - nightNegativeMove; // night
                days++;
                result = resultIntermediate + result; // day add
            } while (result < hight);
            System.out.println(days);
        }
    }
}
