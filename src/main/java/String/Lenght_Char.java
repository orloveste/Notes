package String;

public class Lenght_Char {
    public static void main(String[] args) {
        String s = "Hi, all";
        System.out.println(s);

        int len = s.length(); // the len is 7
        System.out.println(len);

        char theFirstChar = s.charAt(0);  // 'H' has the index 0
        System.out.println(theFirstChar);

        char theFifthChar = s.charAt(4); // 'a' has the index 4
        System.out.println(theFifthChar);

        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
        System.out.println(theLastChar);
    }
}
