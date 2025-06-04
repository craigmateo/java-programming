import java.time.LocalDate;
import java.util.Scanner;

public class YearOfBirthWithMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        int birthYear = today.getYear();

        // If birthday hasn’t happened yet this year, subtract 1 from birth year
        if (birthMonth > today.getMonthValue()) {
            birthYear -= (age + 1);
        } else {
            birthYear -= age;
        }

        System.out.println("You were likely born in: " + birthYear);

        scanner.close();
    }
}
