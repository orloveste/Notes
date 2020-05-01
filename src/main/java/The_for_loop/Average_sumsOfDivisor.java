package The_for_loop;

import java.util.Scanner;

public class Average_sumsOfDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = -5;//scanner.nextInt();
        double max = 12;//scanner.nextDouble();
        double variabila = 0;
        double suma =0;
        int count = 0;
        while (min % 3 != 0) {
            min++;
        }
        variabila = min + variabila;
        for (;variabila <= max; count++){
            suma = suma + variabila;
            variabila = variabila + 3;
        }
        System.out.println(suma/count);
    }
}
