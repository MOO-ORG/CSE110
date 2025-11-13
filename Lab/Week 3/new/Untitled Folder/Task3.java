import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Energy (E) and Number of Rivers (N): ");
        int E = sc.nextInt();
        int N = sc.nextInt();

        while (N-- > 0) {
            System.out.println("Enter river distance (D): ");
            int D = sc.nextInt();
            if (E <= 0) {
                System.out.println("Tired at river : " + (N));
                return;
            } else {
                if (D <= 5) {
                    E -= 2;
                } else {
                    E -= D / 2;
                }
            }
        }
        System.out.println("All Done");
        System.out.println("Energy left: " + E);
        
        sc.close();
    }
}
