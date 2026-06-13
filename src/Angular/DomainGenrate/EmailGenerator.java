public class EmailGenerator {
    public static void main(String[] args) {
        String firstName = "Vikas";
        String lastName = "Patil";

        // Convert to lowercase and remove spaces
        String email = (firstName + lastName).toLowerCase() + "@gmail.com";

        System.out.println("Generated Email: " + email);
    }
}