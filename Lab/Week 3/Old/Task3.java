
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i <= 600; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        sc.close();
    }

}
