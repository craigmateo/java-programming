import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option (1, 2, or 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose option 1: View balance.");
                break;
            case 2:
                System.out.println("You chose option 2: Deposit funds.");
                break;
            case 3:
                System.out.println("You chose option 3: Withdraw funds.");
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        scanner.close();
    }
}

