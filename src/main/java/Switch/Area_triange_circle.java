package Switch;

import java.util.Scanner;

public class Area_triange_circle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String typeOfRoom;
        double a, b, c, r;

        switch (typeOfRoom = reader.nextLine()) {
            case "triangle" :
                a = reader.nextDouble();
                b = reader.nextDouble();
                c = reader.nextDouble();
                double s = ((a + b + c) / 2.0d);
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "rectangle" :
                a = reader.nextDouble();
                b = reader.nextDouble();
                System.out.println(a * b);
                break;
            case "circle" :
                r = reader.nextDouble();
                System.out.println(3.14 * r * r);
                break;
        }
    }
}
