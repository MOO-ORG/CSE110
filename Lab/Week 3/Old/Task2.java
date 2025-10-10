import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N = ");

        int number = sc.nextInt();
        int sum = 0;
        double average = 0.0;

        System.out.println("Input the " + number + " numbers: ");

        for (int i = 0; i < number; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        average = (double) sum / number;

        System.out.printf("The sum of %d no is   : %d\n", number, sum);
        System.out.printf("The Average is       : %.2f\n", average);

        sc.close();
    }
}