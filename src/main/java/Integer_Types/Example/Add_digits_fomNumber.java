package Integer_Types.Example;

import java.util.Scanner;

public class Add_digits_fomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number from 100 to 999: ");
        int num = scanner.nextInt();
        int result;
        if (num >= 100 && num <= 999){
            int unitati = num % 10;
            int zeci = num % 100 / 10;
            int sute = num % 1000 / 100;
            result = unitati + zeci + sute;
            System.out.println("Sum of individual digits is: " + result);
        } else {
            System.out.println("Bye! Your number is out of range");
        }
    }
}
