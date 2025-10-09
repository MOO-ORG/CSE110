# Tracing3 - Code Trace

## Tracing3 Class

```java
public class Tracing3 {

    public static void main(String[] args) {
        int p = 5;
        int q = 6;
        int r = 9;
        int sum = 0;
        if (p < 12) {
            System.out.println(r + 2);
        } else {
            System.out.println(r + p);
        }
        if (q > 20) {
            System.out.println(r + 19);
        } else if (q <= 6) {
            System.out.println(q + 3);
        } else {
            System.out.println(p + q + r);
        }
        if (r > 15) {
            System.out.println(r);
        } else if (r == 0) {
            System.out.println(p + q);
        } else {
            System.out.println(p);
        }
        if (sum != 0) {
            System.out.println(3);
        } else {
            System.out.println(sum + 32);
        }
        if (p > 0 && r < 10) {
            System.out.println(p + r);
        } else {
            System.out.println(p - r);
        }
    }
}
```

---

## **Main Method Execution**

### Variable Initialization

```java
int p = 5;
int q = 6;
int r = 9;
int sum = 0;
```

**Initial State:**
- `p = 5`
- `q = 6`
- `r = 9`
- `sum = 0`

---

## **First If Statement**

```java
if (p < 12) {
    System.out.println(r + 2);
} else {
    System.out.println(r + p);
}
```

**Evaluation:**
```
Condition: p < 12
          5 < 12 → TRUE
```

**Execution:**
```
Step 1: Condition is TRUE, execute if block
Step 2: Print r + 2 = 9 + 2 = 11
```

**Output:** `11`

---

## **Second If-Else-If Statement**

```java
if (q > 20) {
    System.out.println(r + 19);
} else if (q <= 6) {
    System.out.println(q + 3);
} else {
    System.out.println(p + q + r);
}
```

**Evaluation:**
```
Condition 1: q > 20
            6 > 20 → FALSE

Condition 2: q <= 6
            6 <= 6 → TRUE
```

**Execution:**
```
Step 1: First condition is FALSE, check else if
Step 2: Else if condition is TRUE, execute else if block
Step 3: Print q + 3 = 6 + 3 = 9
```

**Output:** `9`

---

## **Third If-Else-If Statement**

```java
if (r > 15) {
    System.out.println(r);
} else if (r == 0) {
    System.out.println(p + q);
} else {
    System.out.println(p);
}
```

**Evaluation:**
```
Condition 1: r > 15
            9 > 15 → FALSE

Condition 2: r == 0
            9 == 0 → FALSE
```

**Execution:**
```
Step 1: First condition is FALSE, check else if
Step 2: Else if condition is FALSE, execute else block
Step 3: Print p = 5
```

**Output:** `5`

---

## **Fourth If-Else Statement**

```java
if (sum != 0) {
    System.out.println(3);
} else {
    System.out.println(sum + 32);
}
```

**Evaluation:**
```
Condition: sum != 0
          0 != 0 → FALSE
```

**Execution:**
```
Step 1: Condition is FALSE, execute else block
Step 2: Print sum + 32 = 0 + 32 = 32
```

**Output:** `32`

---

## **Fifth If-Else Statement (Compound Condition)**

```java
if (p > 0 && r < 10) {
    System.out.println(p + r);
} else {
    System.out.println(p - r);
}
```

**Evaluation:**
```
Condition: p > 0 && r < 10
          (5 > 0) && (9 < 10)
          TRUE && TRUE → TRUE
```

**Execution:**
```
Step 1: Both conditions are TRUE, execute if block
Step 2: Print p + r = 5 + 9 = 14
```

**Output:** `14`

---

## **Final Output**

The program produces the following output:
```
11
9
5
32
14
```

---

## **Final State Summary**

**Variables (unchanged throughout execution):**
- `p = 5`
- `q = 6`
- `r = 9`
- `sum = 0`

**Note:** No variables were modified during execution. All operations were performed for conditional checks and print statements only.