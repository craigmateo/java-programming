import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctNumber = 3;
        int guess;

        System.out.println("Guess a number between 1 and 5:");

        while (true) {
            System.out.print("Your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess == correctNumber) {
                    System.out.println("Correct! Exiting program.");
                    break;
                } else {
                    System.out.println("Wrong! Try again.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // consume the invalid input
            }
        }

        scanner.close();
    }
}
