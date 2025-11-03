
import java.util.Scanner;

public class Task2 {

    public static double discountAmount(double number) {
        return number / 100.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("%-30s : ", "Enter age");
        int age = sc.nextInt();

        System.out.printf("%-30s : ", "Electricity consumed: ");
        int electricityConsumed = sc.nextInt();

        System.out.println();

        if (electricityConsumed <= 0) {
            System.out.println("Invalid electricity consumed entered.");
            sc.close();
            return;
        }

        if (age <= 0) {
            System.out.println("Invalid age entered.");
            sc.close();
            return;
        }

        double totalBill = 0.0;
        double ratePerUnit = 15.0;

        double baseBill = ratePerUnit * electricityConsumed;

        if (age < 18) {
            totalBill = baseBill - discountAmount(20) * baseBill;
        } else if (age >= 18 && age <= 60) {
            totalBill = baseBill;
        } else if (age > 60) {
            totalBill = baseBill - discountAmount(10) * baseBill;

            if (electricityConsumed > 100) {
                totalBill += discountAmount(5) * totalBill;
            }
        }

        System.out.printf("%-30s : %.1f Taka\n", "Total bill", totalBill);
        sc.close();
    }
}