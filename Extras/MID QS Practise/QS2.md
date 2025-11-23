# Question 2 [CO1] [6 Points]
**Answer on the answer script**

Implement a Java program based on the following flowchart logic.

### Flowchart Logic
1. Start.
2. Prompt: `Current Balance:` → read `balance`.
3. Prompt: `Transaction Amount:` → read `transaction`.
4. If `transaction <= 0`:
     - Print: `Invalid Amount`
     - Terminate.
5. Else check `transaction <= balance`:
     - If false:
         - Print: `Insufficient Balance`
         - Terminate.
     - If true:
         - Update: `balance = balance - transaction`
         - Print: `Transaction Successful`
         - Print: `Current Balance: <updated balance>`
         - Terminate.

---

## Solution Code

```java
import java.util.Scanner;

public class TransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Transaction Amount: ");
        double transaction = sc.nextDouble();

        if (transaction <= 0) {
            System.out.println("Invalid Amount");
        } else {
            if (transaction <= balance) {
                balance = balance - transaction;
                System.out.println("Transaction Successful");
                System.out.println("Current Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        sc.close();
    }
}
