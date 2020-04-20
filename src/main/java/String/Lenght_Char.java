package String;

public class Lenght_Char {
    public static void main(String[] args) {
        // compare
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases

        //appending values -  left to right
        /*String shortString = "str";
        long number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        System.out.println(result1);
        String result2 = number + 50 + shortString; // what is the result2?
        System.out.println("result 2 = 150str : "+result2);*/

        /*String firstName = "John";
        String lastName = "Smith";

// concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "John Smith"
        System.out.println(fullName1);

// concatenation using the concat method
        String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"
        System.out.println(fullName2);*/

        //Exceptions
/*//        String s = null;
//        int length = s.length(); // it throws NullPointerException
//        System.out.println(length);

        String s1 = "ab";
        char c = s1.charAt(2);
        // it throws StringIndexOutOfBoundsException because indexing starts with 0
        System.out.println(c);*/

        /*// methods of strings
        String text = "The simple text string";
        System.out.println(text);

        boolean empty = text.isEmpty(); // false
        System.out.println(empty);

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"
        System.out.println(textInUpperCase);

        boolean startsWith = textInUpperCase.startsWith("THE"); // true
        System.out.println(startsWith);

        *//* replace all whitespaces with empty strings *//*
        String noWhitespaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"
        System.out.println(noWhitespaces);

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        System.out.println(textWithWhitespaces);

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        System.out.println(trimmedText);*/

        /*String s = "Hi, all";
        System.out.println(s);

        int len = s.length(); // the len is 7
        System.out.println(len);

        char theFirstChar = s.charAt(0);  // 'H' has the index 0
        System.out.println(theFirstChar);

        char theFifthChar = s.charAt(4); // 'a' has the index 4
        System.out.println(theFifthChar);

        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
        System.out.println(theLastChar);*/
    }
}
