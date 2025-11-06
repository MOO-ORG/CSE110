import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N = ");
        int num = sc.nextInt();

        double sum = 0.0, max = 0.0, avg = 0.0;

        for (int i = 0; i < num; i++) {
            int number = sc.nextInt();

            if (number > max) {
                max = number;
            }
            sum += number;
        }
        avg = sum / num;

        System.out.println("The sum of " + num + "no is: " + sum);
        System.out.println("The avergae is " + avg);
        sc.close();
    }
}
