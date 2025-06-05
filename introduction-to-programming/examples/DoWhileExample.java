import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        String input;

        do {
            System.out.print("Enter the password: ");
            input = scanner.nextLine();
        } while (!input.equals(correctPassword));

        System.out.println("Access granted!");
        scanner.close();
    }
}
