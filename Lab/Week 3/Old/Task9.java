import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int posCount = 0, negCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + i + ": ");
            int num = sc.nextInt();
            if (num < 0) {
                negCount++;
            } else {
                posCount++;
            }
        }
        System.out.println(posCount + " Non-Negative Numbers");
        System.out.println(negCount + " Negative Numbers");

        sc.close();
    }

}
