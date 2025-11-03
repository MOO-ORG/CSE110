
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%-35s: ", "Please enter an integer number");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.printf("Yes! The number %d is divisible by both 5 and 7%n", number);
        } else if (number % 5 == 0) {
            System.out.println("Only Divisible by 5");
        } else if (number % 7 == 0) {
            System.out.println("Only Divisible by 7");
        } else {
            System.out.printf("No! The number %d is not divisible by both 5 and 7%n", number);
        }
        scanner.close();
    }
}