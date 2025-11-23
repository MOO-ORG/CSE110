# Question 1 [CO1] [10 Points]

While wandering through the Amazon, you find a hidden temple. Inside is a treasure chest that requires solving a riddle. The chest asks for two numbers defining a range. Within that range there must be composite numbers, and the count of those composite numbers must be a factor of the absolute difference between the start and end values. You decide to write a Java program to test ranges before entering them.

Write a Java program that takes two integers (start and end) as input and counts how many composite numbers are in the inclusive range. Then:
- If the absolute difference between start and end is a multiple of the composite count, print: `Congratulations! The treasure is yours.`
- If it is not a multiple, print: `Close! But not quite.`
- If there are no composite numbers, print: `Too far off.`

## Sample Inputs & Outputs

| Sample Input                | Sample Output                                            | Explanation                                                                                              |
| :-------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------------------------------------------- |
| **Start:** 8<br>**End:** 12 | `8 9 10 12`<br>`Congratulations! The treasure is yours.` | There are 4 composite numbers (8, 9, 10, 12). Absolute difference is 4; 4 is divisible by 4, so success. |
| **Start:** 5<br>**End:** 14 | `6 8 9 10 12 14`<br>`Close! But not quite.`              | There are 6 composite numbers. Absolute difference is 9; 9 is not divisible by 6, so not a success.      |
| **Start:** 1<br>**End:** 3  | `Too far off.`                                           | There are no composite numbers in this range.                                                            |

---

## Solution Code

```java
import java.util.Scanner;

public class TreasureChestSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        int absDiff;
        if (start > end) {
            absDiff = start - end;
        } else {
            absDiff = end - start;
        }

        int min, max;
        if (start < end) {
            min = start;
            max = end;
        } else {
            min = end;
            max = start;
        }

        int compositeCount = 0;

        for (int i = min; i <= max; i++) {
            boolean isComposite = false;

            if (i > 1) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }

            if (isComposite) {
                System.out.print(i + " ");
                compositeCount++;
            }
        }

        System.out.println();

        if (compositeCount == 0) {
            System.out.println("Too far off.");
        } else {
            if (absDiff % compositeCount == 0) {
                System.out.println("Congratulations! The treasure is yours.");
            } else {
                System.out.println("Close! But not quite.");
            }
        }

        sc.close();
    }
}
