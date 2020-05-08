package Whil_and_DoWhile;

import java.util.Scanner;

public class Bank_income {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int putMoney = reader.nextInt(); //100;
        int percentYear = reader.nextInt() * 100 / 100; //15 * 100 / 100;
        int expectedMoney = reader.nextInt(); //120;
        int howManyYearsNeed = 0;
        double capitalizare = putMoney;
        if (capitalizare != expectedMoney) {
            do {
                capitalizare = capitalizare + (capitalizare * percentYear / 100);
                howManyYearsNeed++;
            }  while (capitalizare < expectedMoney);
        }
        System.out.println(howManyYearsNeed);
    }
}
