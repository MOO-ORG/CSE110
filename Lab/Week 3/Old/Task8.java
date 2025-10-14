import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();

            if (n < 0) {
                break;
            } else {
                System.out.println(n * n);
            }
        }

        sc.close();
    }

}
