import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_SET = 
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
        "abcdefghijklmnopqrstuvwxyz" +
        "0123456789" +
        "!@#$%^&*()-_=+";

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(CHAR_SET.length());
            password.append(CHAR_SET.charAt(index));
        }

        System.out.println("Generated Password1: " + password.toString());
        System.out.println("Generated Password2: " + password.toString());
    }
}
