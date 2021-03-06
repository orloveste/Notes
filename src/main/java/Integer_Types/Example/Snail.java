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
        int dayMoveA = reader.nextInt();
        System.out.print("Enter 'B' (minim one): ");
        int nightNegativeMoveB = reader.nextInt();

        int days = 1;
        for (int i = dayMoveA; i < hight; i += dayMoveA - nightNegativeMoveB) {
            days++;
        }
        System.out.println(days);
    }
}
