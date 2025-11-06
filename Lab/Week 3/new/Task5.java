import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number =sc.nextInt();


        if(number <= 0){
            sc.close();
            return;
        }

        int sum =0;

        for (int i = 1; i <= number; i++) {
            int calculate;

            if (i % 2 == 0) {
                calculate = -1* i * i;
                sum += calculate;
                // System.out.print(calculate + ", ");
            } else {
                calculate = i * i;
                sum+= calculate;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
