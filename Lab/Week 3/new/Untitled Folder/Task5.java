import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N-digit vault code:");
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        // Count digits
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Divisor count
        int divisor = 1;
        for (int i = 1; i < digitCount; i++) {
            divisor *= 10;
        }

        // Extract and print each digit from left to right
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            int digit = temp / divisor;
            System.out.print(digit);
            if (i != digitCount - 1) {
                System.out.print(", ");
            }
            temp %= divisor;
            divisor /= 10;
        }
        System.out.println();

        sc.close();
    }
}
