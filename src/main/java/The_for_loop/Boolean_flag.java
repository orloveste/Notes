package The_for_loop;

public class Boolean_flag {
    public static void main(String[] args) {
        boolean stopped = false;
        for (int i = 0; (i < 10) && !stopped; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    stopped = true;
                    break;
                }
            }
            System.out.println();
        }
    }
}
