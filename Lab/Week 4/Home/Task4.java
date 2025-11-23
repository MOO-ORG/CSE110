
import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Members:");
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println("Exercises for Member-" + i + ":");
            int n = sc.nextInt();

            int max = 3;
            if (n > max) {
                n = max;
            }

            int sum = 0;
            double total = 0;
            boolean lowCal = true;

            for (int j = 1; j <= n; j++) {
                System.out.println("Exercise-" + j + ":");
                int cal = sc.nextInt();
                sum += cal;

                double c = cal;
                if (cal > 350) {
                    c = c + (c * 0.50);
                }
                total += c;

                if (cal >= 200) {
                    lowCal = false;
                }
            }

            double rawAvg = (double) sum / n;

            if (rawAvg > 400) {
                total += (n * 50);
            }

            double avg = total / n;

            if (lowCal) {
                avg = avg - (avg * 0.10);
            }

            System.out.println("Average calories earned per day for Member-" + i + ": " + avg);
        }

        sc.close();
    }
}
