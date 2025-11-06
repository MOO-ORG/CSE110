import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int output= 0;

        while(true){
            System.out.print("Enter number: ");
            int input=sc.nextInt();
            if (input < 0){
                sc.close();
                return;
            } else{
                output = input *input;
                System.out.println(output);
            }
        }
    }
}
