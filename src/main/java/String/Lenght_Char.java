package String;

public class Lenght_Char {
    public static void main(String[] args) {
        // methods of strings
        String text = "The simple text string";
        System.out.println(text);

        boolean empty = text.isEmpty(); // false
        System.out.println(empty);

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"
        System.out.println(textInUpperCase);

        boolean startsWith = textInUpperCase.startsWith("THE"); // true
        System.out.println(startsWith);

        /* replace all whitespaces with empty strings */
        String noWhitespaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"
        System.out.println(noWhitespaces);

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        System.out.println(textWithWhitespaces);

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        System.out.println(trimmedText);

//        String s = "Hi, all";
//        System.out.println(s);
//
//        int len = s.length(); // the len is 7
//        System.out.println(len);
//
//        char theFirstChar = s.charAt(0);  // 'H' has the index 0
//        System.out.println(theFirstChar);
//
//        char theFifthChar = s.charAt(4); // 'a' has the index 4
//        System.out.println(theFifthChar);
//
//        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
//        System.out.println(theLastChar);
    }
}
