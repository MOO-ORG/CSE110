import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers (N) : ");

        int N = sc.nextInt();

        int nonNegativeCount = 0;
        int negativeCount = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter integer number " + i + ": ");
            int num = sc.nextInt();
            if (num >= 0) {
                nonNegativeCount++;
            } else {
                negativeCount++;
            }
        }

        if (nonNegativeCount > 0) {
            System.out.println(nonNegativeCount + "Non-negative numbers");
        } else {
            System.out.println("No Non-negative numbers");
        }

        if (negativeCount > 0) {
            System.out.println(negativeCount + " Negative numbers");
        } else {
            System.out.println("No Negative numbers");
        }

        sc.close();
    }
}
