import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter sales for Day " + i + ": ");

            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();

            int total = p1 + p2 + p3;
            double tax = 0;

            if (total >= 500) {
                tax = total * 0.10;
            } else if (total >= 200) {
                tax = total * 0.05;
            } else if (total >= 100) {
                tax = total * 0.02;
            }

            double result = total + tax;

            System.out.println("Day " + i + " Total sales including tax: " + result);
        }

        sc.close();
    }
}
