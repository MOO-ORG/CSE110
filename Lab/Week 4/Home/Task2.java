import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students to check: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student ID:");
            int id = sc.nextInt();

            boolean isLucky = false;

            if (id > 0) {
                int temp = id;
                while (temp % 2 == 0) {
                    temp = temp / 2;
                }
                if (temp == 1) {
                    isLucky = true;
                }
            }

            if (isLucky) {
                System.out.println("Lucky ID");
            } else {
                System.out.println("Not Lucky");
            }
        }

        sc.close();
    }

}
