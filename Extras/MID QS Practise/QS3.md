# Question 3 [CO4] [4 Points]
**Answer on the question paper**

The code below is intended to print an integer's digits from right to left, but it contains **5 errors**. Identify and correct them.

## Original Code (With Errors)
```java
1  import java.util.Scanner;
2  public class test
3  {
4      public static void main (String args)
5      {
6          Scanner scan = new Scanner (System);
7          int num = scan.nextInt();
8          int temp1 = '0';
9          while(num == 0)
10         {
11             temp1 = num / 10;
12             num /= 10;
13             System.out.print(temp1 + " ");
14         }
15     }
16 }
```

## Error Fixes

| Line | Corrected Code                           | Explanation                                 |
| :--- | :--------------------------------------- | :------------------------------------------ |
| 4    | `public static void main(String[] args)` | Missing array brackets for `args`.          |
| 6    | `Scanner scan = new Scanner(System.in);` | Must use `System.in` (input stream).        |
| 8    | `int temp1 = 0;`                         | `'0'` is a char (ASCII 48); need integer 0. |
| 9    | `while (num != 0)`                       | Loop should continue while digits remain.   |
| 11   | `temp1 = num % 10;`                      | Modulo extracts the rightmost digit.        |

## Full Corrected Code

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int temp1 = 0;

        while (num != 0) {
            temp1 = num % 10;
            num /= 10;
            System.out.print(temp1 + " ");
        }
    }
}
```
