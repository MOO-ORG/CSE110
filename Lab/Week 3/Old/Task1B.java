public class Task1B {
    public static void main(String args[]) {

        int number = 9;

        for (int i = 2; i <= 7; i++) {
            if (i % 2 == 0) {
                System.out.print(number * i + ", ");
            } else {
                if (i == 7) {
                    System.out.print("-" + number * i);
                } else {
                    System.out.print("-" + number * i + ", ");
                }
            }
        }
    }
}