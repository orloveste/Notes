package Boolean;

public class Logical_operators {
    public static void main(String[] args) {
//      Logical operators - example: trekking
        boolean cold = false;
        boolean dry = true;
        boolean summer = false; // suppose now is autumn

        boolean trekking = (dry && !cold) || summer; // true, let's go to trek!


//      Order Logical operators  ! (NOT) -> ^ (XOR) -> && (AND) -> || (OR)
        /*boolean b = true && !false; // true, because !false is evaluated first
        System.out.println(b);*/

//        Logical operators - XOR (exclusive OR)
        /*boolean b1 = false ^ false; // false
        System.out.println(b1);
        boolean b2 = false ^ true;  // true
        System.out.println(b2);
        boolean b3 = true ^ false;  // true
        System.out.println(b3);
        boolean b4 = true ^ true;   // false
        System.out.println(b4);*/

//        Logical operators - OR
        /*boolean b1 = false || false; // false
        System.out.println(b1);
        boolean b2 = false || true;  // true
        System.out.println(b2);
        boolean b3 = true || false;  // true
        System.out.println(b3);
        boolean b4 = true || true;   // true
        System.out.println(b4);*/

//        Logical operators - AND
        /*boolean b1 = false && false; // false
        System.out.println(b1);
        boolean b2 = false && true;  // false
        System.out.println(b2);
        boolean b3 = true && false;  // false
        System.out.println(b3);
        boolean b4 = true && true;   // true
        System.out.println(b4);*/

//        Logical operators - NOT
        /*boolean f = false; // f is false
        System.out.println(f);
        boolean t = !f;    // t is true
        System.out.println(t);*/
    }
}
