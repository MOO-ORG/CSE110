import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of terms : ");
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        int sum = 0;

        System.out.println("The odd numbers are : ");
        while (true) {
            System.out.println(i);
            sum += i;
            count++;
            i += 2;
            if (count == n) {
                break;
            }
        }
        System.out.println("The Sum of odd natural numbers up to" + n + "is : " + sum);

        sc.close();
    }

}
