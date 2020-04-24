package Relational_operators;

import java.util.Scanner;

public class CheckAscOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        /*boolean descOrdered = (h1 >= h2) && (h2 >= h3);
        System.out.println(descOrdered);*/
        System.out.println((h1 >= h2) && (h2 >= h3));
    }
}
