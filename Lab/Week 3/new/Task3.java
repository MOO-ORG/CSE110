import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int power = 40;

        for (int i = 1; i <= days; i++) {

            if (i % 3 == 0) {
                power -= 45;
            } else if (i % 5 == 0) {
                power += 25;
            } else {
                power += 10;
            }

            if (power > 500) {
                power -= 50;
            }

            if (power < 0) {
                System.out.println("Blackout on Day " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Final Power: " + power);
        sc.close();
    }
}
