import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of herbs and crystals: ");
        int H = sc.nextInt();
        int C = sc.nextInt();

        int potions = 0;

        while (H >= 3 && C >= 2) {
            potions++;
            H -= 3;
            C -= 2;
            System.out.println("Potion " + potions + " created.");
            System.out.println("Remaining herbs: " + H + ", Remaining Crystals: " + C);
        }

        System.out.println("Total Potions Created: " + potions);
        if (potions % 2 == 0) {
            System.out.println("Stable Elixir");
        } else {
            System.out.println("Volatile Brew");
        }
        sc.close();
    }
}
