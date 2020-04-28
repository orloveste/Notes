package The_for_loop;

public class Skipping_parts {
    public static void main(String[] args) {
//        It is possible to declare a variable outside the loop:

        int i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }

//        Moreover, it is also possible to write an infinite loop without these parts at all:
        /*for (;;) {
            System.out.println("Infinite loop");
        }*/
    }
}
