import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num < 10) {
                System.out.print(num);
                break;
            } else {
                System.out.print(num % 10 + ", ");
                num /= 10;
            }
        }
        sc.close();
    }
}
