import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
        System.out.println(result);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
