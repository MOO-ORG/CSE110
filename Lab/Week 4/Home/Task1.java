import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int start = sc.nextInt();
        System.out.println("Enter ending number:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0;
            int sum = 0;

            // Count digit
            int temp = i;
            while (temp != 0) {
                count++;
                temp /= 10;
            }

            // Main calculation
            temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                int prod = 1;
                for (int j = 0; j < count; j++) {
                    prod *= digit;
                }
                sum += prod;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }

        sc.close();
    }
}
