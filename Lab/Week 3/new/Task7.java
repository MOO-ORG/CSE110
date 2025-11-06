
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hour (H): ");
        int h = sc.nextInt();
        System.out.print("Enter Water Units (W): ");
        int w = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            if (i % 2 == 0) {
                w -= 5 * 4;
            } else {
                w -= 5 * 3;
            }

            if (w < 0) {
                System.out.println("Stopped at Hour " + i);
                sc.close();
                return;
            }
        }

        System.out.println("All Watered");
        System.out.println(w + " Water Unit Left");
        sc.close();
    }
}
