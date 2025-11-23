
# Question 4 [CO1] [5 Points]
**Answer on the question paper**

Trace the following code and illustrate the outputs. Show your workings on the answer script—answers without workings will not be accepted.

## Code to Trace

```java
public class QS4_Tracing {
    public static void main(String[] args) {
        int n1 = 184;
        int n2 = 24;
        int n3 = 56;
        while (!((n1 == n2) && (n2 == n3))) {
            if (n1 > n2) {
                if (n2 > n3) {
                    n1 -= n2;
                    System.out.println(n1);
                } else {
                    if (n1 > n3) {
                        n1 -= n3;
                        System.out.println(n1);
                    } else {
                        n3 -= n1;
                        System.out.println(n3);
                    }
                }
            } else {
                if (n2 > n3) {
                    if (n1 > n3) {
                        n2 -= n1;
                        System.out.println(n2);
                    } else {
                        n2 -= n3;
                        System.out.println(n2);
                    }
                } else {
                    n3 -= n2;
                    System.out.println(n3);
                }
            }
        }
        System.out.println(n1);
    }
}

```

## Tracing Steps

Step-by-step trace showing values of `n1`, `n2`, and `n3` at each iteration:

**Initial values:**
- n1 = 184
- n2 = 24
- n3 = 56

**Loop condition:** Continue while NOT all three are equal

---

**Iteration 1:**
- Check: n1 (184) > n2 (24)? **YES**
  - Check: n2 (24) > n3 (56)? **NO**
    - Check: n1 (184) > n3 (56)? **YES**
      - n1 -= n3 → n1 = 184 - 56 = **128**
      - Print: **128**

Values: n1=128, n2=24, n3=56

---

**Iteration 2:**
- Check: n1 (128) > n2 (24)? **YES**
  - Check: n2 (24) > n3 (56)? **NO**
    - Check: n1 (128) > n3 (56)? **YES**
      - n1 -= n3 → n1 = 128 - 56 = **72**
      - Print: **72**

Values: n1=72, n2=24, n3=56

---

**Iteration 3:**
- Check: n1 (72) > n2 (24)? **YES**
  - Check: n2 (24) > n3 (56)? **NO**
    - Check: n1 (72) > n3 (56)? **YES**
      - n1 -= n3 → n1 = 72 - 56 = **16**
      - Print: **16**

Values: n1=16, n2=24, n3=56

---

**Iteration 4:**
- Check: n1 (16) > n2 (24)? **NO**
  - Check: n2 (24) > n3 (56)? **NO**
    - n3 -= n2 → n3 = 56 - 24 = **32**
    - Print: **32**

Values: n1=16, n2=24, n3=32

---

**Iteration 5:**
- Check: n1 (16) > n2 (24)? **NO**
  - Check: n2 (24) > n3 (32)? **NO**
    - n3 -= n2 → n3 = 32 - 24 = **8**
    - Print: **8**

Values: n1=16, n2=24, n3=8

---

**Iteration 6:**
- Check: n1 (16) > n2 (24)? **NO**
  - Check: n2 (24) > n3 (8)? **YES**
    - Check: n1 (16) > n3 (8)? **YES**
      - n2 -= n1 → n2 = 24 - 16 = **8**
      - Print: **8**

Values: n1=16, n2=8, n3=8

---

**Iteration 7:**
- Check: n1 (16) > n2 (8)? **YES**
  - Check: n2 (8) > n3 (8)? **NO**
    - Check: n1 (16) > n3 (8)? **YES**
      - n1 -= n3 → n1 = 16 - 8 = **8**
      - Print: **8**

Values: n1=8, n2=8, n3=8

---

**Loop ends** (all three values are equal: 8 == 8 == 8)

Final print statement outside loop: **8**

---

## Complete Output
```
128
72
16
32
8
8
8
8
```

**Note:** This algorithm computes the **Greatest Common Divisor (GCD)** of three numbers using a variant of the Euclidean algorithm. The GCD of 184, 24, and 56 is **8**.

