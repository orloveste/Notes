import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing {
    public static void main(String args[]) {
        System.out.println(Direction.NORTH.toString());
        System.out.println(Direction.NORTH.getShortCode());// returns "N" as a String

        //System.out.println(Direction.valueOf("N"));// returns Direction.NORTH as an Direction object

        System.out.println(Direction.valueOf("NORTH"));// returns Direction.NORTH as an Direction object

        System.out.println(Direction.NORTH.name());// returns "NORTH" as a String

    }
    enum Direction {
        EAST("E"),
        WEST("W"),
        NORTH("N"),
        SOUTH("S");

        private final String shortCode;

        Direction(String code) {
            this.shortCode = code;
        }

        public String getShortCode() {
            return this.shortCode;
        }
    }
//
//        Person person = new Person("R. Johnson");
//
//        System.out.println(person.getNextId()); // (1)
//    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        this.name = name; // (2)
        this.id = nextId;
        nextId++; // (3)
    }

    public long getNextId() { // (4)
        return nextId;
    }
}
