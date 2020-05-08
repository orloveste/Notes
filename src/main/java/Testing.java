import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int busHeight = reader.nextInt();

        int arrayLength = reader.nextInt(); //how many bridges
        List<Integer> bridgeHeight = new ArrayList<>(arrayLength);
        int indexOfArray = 0;
        while (indexOfArray < arrayLength) {
            bridgeHeight.add(indexOfArray, reader.nextInt());
            indexOfArray++;
        }

        String text = "Will not crash";
        for (int i = 0; i < bridgeHeight.size(); i++) {
            if (bridgeHeight.get(i) <= busHeight) {
                indexOfArray = i+1;
                text = "Will crash on bridge " + indexOfArray;
                break;
            }
        }
        System.out.println(text);
//        String f = "Will not crash";
//        boolean b;
//        while (b = true) {
//            for (int i = 0; i < bridgeHeight.size(); i++) {
//                if (bridgeHeight.get(i) <= busHeight) {
//                    System.out.println(text + ++i);
//                    b = false;
//                    break;
//                }
//            }
//
//            System.out.println(text);
//        }

//        do {
//            for (int i = 0; i < bridgeHeight.size(); i++) {
//                if (bridgeHeight.get(i) <= busHeight) {
//                    System.out.println("Will crash on bridge " + ++i);
//                    break;
//                }
//            }
//        } while ();

//        System.out.println(busHeight);
//        System.out.println(bridgeHeight);
    }
}
