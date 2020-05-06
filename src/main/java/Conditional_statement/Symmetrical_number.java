package Conditional_statement;

import java.util.Random;
import java.util.Scanner;

public class Symmetrical_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fourDigitNumber = reader.nextInt(); //2001;
        int revertNum = Integer.parseInt(String.valueOf(new StringBuilder(fourDigitNumber + "").reverse()));
        if (fourDigitNumber == revertNum) {
            System.out.println(1);
        } else {
            System.out.println(new Random().nextInt());
        }
    }
}
