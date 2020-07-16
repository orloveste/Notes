package Enum;

import java.net.CacheRequest;

public class Battery {
    public static void main(String[] args) {
        System.out.println(ChargeLevel.findByColor("yellow")); // MEDIUM
        /*System.out.println(ChargeLevel.LOW.sections); // 1
        System.out.println(ChargeLevel.LOW.color); // red*/
    }
    public enum ChargeLevel {

        FULL(4, "green"),
        HIGH(3, "green"),
        MEDIUM(2, "yellow"),
        LOW(1, "red");

        int sections;
        String color;

        ChargeLevel(int sections, String color) {
            this.sections = sections;
            this.color = color;
        }

        public int getSections() {
            return sections;
        }

        public String getColor() {
            return color;
        }
        public static ChargeLevel findByColor(String color) {
            for (ChargeLevel value: values()) {
                if (color.equals(value.color)) {
                    return value;
                }
            }
            return null;
        }
    }
}
