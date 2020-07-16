package Enum;

public class User {
    public static void main(String[] args) {
        UserStatus status = UserStatus.PENDING; // some status

        switch (status) {
            case PENDING:
                System.out.println("You need to wait a little.");
                break;
            case ACTIVE:
                System.out.println("No problems, you may pass here.");
                break;
            case BLOCKED:
                System.out.println("Stop! You can't pass here.");
                break;
            default:
                System.out.println("Unsupported enum constant.");
        }
    }
    public enum UserStatus {
        PENDING, ACTIVE, BLOCKED
    }
}
