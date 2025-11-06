public class Task1_2 {
    public static void main(String[] args) {

        int base = 9;
        for (int i = 2; i <= 7; i++) {
            int calculate;
            if (i % 2 == 0) {
                calculate = base * i;
                System.out.print(calculate + ", ");
            } else {
                calculate = -1 * base * i;
                if (i == 7) {
                    System.out.print(calculate);
                } else {
                    System.out.print(calculate + ", ");
                }
            }
        }
    }
}
